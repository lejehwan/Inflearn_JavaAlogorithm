package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        String answer = "";
        for (int i = 0; i < A.length; i++) {
            int tempA = Integer.parseInt(A[i]);
            int tempB = Integer.parseInt(B[i]);
            if (tempA == 1 && tempB == 3) answer += "A\n";
            else if(tempA == 3 && tempB == 1) answer += "B\n";
            else{
                if(tempA < tempB) answer += "B\n";
                else if (tempA > tempB) answer += "A\n";
                else answer += "D\n";
            }
        }
        System.out.println(answer);
        br.close();
    }
}
