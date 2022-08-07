package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        int k = 0;
        String temp = "";
        String answer = "";
        for (int i = 0; i < input.length; i++) {
            if(i / 7 == k){
                temp += convert(input[i]);
            }else{
                int value = Integer.parseInt(temp ,2);
                answer += String.valueOf((char)value);
                temp = convert(input[i]);
                k ++;
            }
        }
        System.out.println(answer);
        br.close();
    }

    public static String convert(String str){
        return str.equals("#") ? "1" : "0";
    }
}
