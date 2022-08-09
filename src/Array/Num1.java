package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] convertInt = new int[input.length];
        String answer = "";
        for (int i = 0; i < convertInt.length; i++) {
            convertInt[i] = Integer.parseInt(input[i]);
        }
        answer += convertInt[0] + " ";
        for (int i = 1; i < convertInt.length - 1; i++) {
            if(convertInt[i] < convertInt[i+1]){
                answer += convertInt[i+1] + " ";
            }
        }

        System.out.println(answer.trim());
        br.close();
    }
}
