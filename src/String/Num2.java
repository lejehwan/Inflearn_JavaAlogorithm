package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        String answer = "";
        for (int i = 0; i < str.length; i ++){
            answer += (97 <= str[i] && str[i] <= 122) ? String.valueOf(str[i]).toUpperCase() : String.valueOf(str[i]).toLowerCase();
        }
        System.out.println(answer);
        br.close();
    }
}
