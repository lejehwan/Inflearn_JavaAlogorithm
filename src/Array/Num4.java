package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        String answer = "";
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for (int i : fibo) {
            answer += i + " ";
        }
        System.out.println(answer.trim());
        br.close();
    }
}
