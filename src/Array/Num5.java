package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i < check.length; i++) {
            check[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(check[i]){
                for (int j = 2; j * i<= n; j++) {
                    check[i*j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < check.length; i++) {
            if(check[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
