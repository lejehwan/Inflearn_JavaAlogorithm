package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] pan = new int[n][n];
        for (int i = 0; i < pan.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < pan.length; j++) {
                pan[i][j]= Integer.parseInt(input[j]);
            }
        }
        int hor = 0, ver = 0, left = 0, right = 0;
        int horTemp = 0, verTemp = 0;
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan.length; j++) {
                horTemp += pan[i][j];
                verTemp += pan[j][i];
                if (i == j) right += pan[i][j];
                if (i == 5-j) left += pan[i][j];
            }
            hor = Math.max(hor, horTemp);
            ver = Math.max(ver, verTemp);
            horTemp = 0;
            verTemp = 0;
        }
        System.out.println(Math.max(Math.max(hor,ver),Math.max(left, right)));
        br.close();
    }
}
