package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] pan = new int[n + 2][n + 2];
        int cnt = 0;
        for (int i = 1; i < pan.length - 1; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 1; j < pan.length - 1; j++) {
                pan[i][j] = Integer.parseInt(temp[j-1]);
            }
        }
        for (int i = 1; i < pan.length - 1; i++) {
            for (int j = 1; j < pan.length - 1; j++) {
                if(pan[i][j] > pan[i - 1][j]
                        && pan[i][j] > pan[i][j - 1]
                        && pan[i][j] > pan[i][j + 1]
                        && pan[i][j] > pan[i + 1][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
