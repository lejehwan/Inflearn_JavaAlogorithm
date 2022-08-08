package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] str = input[0].split("");
        String t = input[1];
        int[] temp = new int[str.length];
        boolean[] check = new boolean[str.length];
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(t)){
                check[i] = true;
            }
        }
        for (int i = 0; i < str.length; i++) {
            temp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < check.length; j++) {
                if (check[j]){
                    temp[i] = Math.min(temp[i], Math.abs(j-i));
                }
            }
            answer += temp[i] + " ";
        }
        System.out.println(answer.trim());
        br.close();
    }
}
