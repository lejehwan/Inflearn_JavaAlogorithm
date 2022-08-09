package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] std = br.readLine().split(" ");
        int max = Integer.parseInt(std[0]);
        int cnt = 1;
        for (int i = 1; i < std.length; i++) {
            int temp = Integer.parseInt(std[i]);
            if(max < temp){
                max = temp;
                cnt ++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
