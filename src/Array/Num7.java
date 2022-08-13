package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] temp = br.readLine().split(" ");
        int cnt = 0, answer = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt += 1;
                answer += cnt;
            }
            else cnt = 0;
        }
        System.out.println(answer);
        br.close();
    }
}
