package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0, max = 0;
        String[] str = br.readLine().split(" ");
        for (int i =0; i < str.length; i++){
            if(max < str[i].length()) {
                max = str[i].length();
                idx = i;
            }
        }
        System.out.println(str[idx]);
        br.close();
    }
}
