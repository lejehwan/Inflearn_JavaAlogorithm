package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            if((97 <= ch[i] && ch[i] <= 122) || (65 <= ch[i] && ch[i] <= 90)){
                str += ch[i];
            }
        }
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(str.equals(sb.reverse().toString()) ? "YES" : "NO");
        br.close();
    }
}
