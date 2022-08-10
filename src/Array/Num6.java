package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int[] su = new int[input.length];
        for (int i = 0; i < su.length; i++) {
            su[i] = Integer.parseInt(sb.append(input[i]).reverse().toString());
            sb.setLength(0);
        }
        String answer = "";
        for (int i = 0; i < su.length; i++) {
            answer += checkPrime(su[i]) == true ? su[i] + " " : "";
        }
        System.out.println(answer.trim());
        br.close();
    }

    public static boolean checkPrime(int num){
        if(num == 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
