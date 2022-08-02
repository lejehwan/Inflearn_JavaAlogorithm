package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(str.equals(sb.reverse().toString()) ? "YES" : "NO");
        br.close();
    }
}
