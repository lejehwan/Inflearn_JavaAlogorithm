package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                str += ch[i];
            }
        }
        System.out.println(Integer.parseInt(str));
        br.readLine();
    }
}
