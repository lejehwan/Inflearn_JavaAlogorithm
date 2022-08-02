package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] alpha = new char[26];
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            if(str[i] != alpha[str[i]-'a']){
                alpha[str[i]-'a'] = str[i];
                answer += str[i];
            }
        }
        System.out.println(answer);
        br.close();
    }
}
