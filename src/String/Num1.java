package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        String s = br.readLine().toLowerCase();
        int answer = str.length() - str.replaceAll(s,"").length();
        System.out.println(answer);
    }
}
