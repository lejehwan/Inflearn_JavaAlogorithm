package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        String[] input = br.readLine().split(" ");
        int cnt = 1;
        String answer = "";
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < score.length; i++) {
            int temp = score[i];
            for (int j = 0; j < score.length; j++) {
                if(i == j) continue;
                if(temp < score[j]){
                    cnt++;
                }
            }
            answer += cnt + " ";
            cnt = 1;
        }
        System.out.println(answer.trim());
        br.close();
    }
}
