package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11 {
    public static int cnt = 1;
    public static String answer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        answer = String.valueOf(str[0]);
        for (int i = 0; i < str.length-1; i++) {
            if(str[i] == str[i+1]){
                cnt++;
            }else{
                checkCnt();
                answer += str[i+1];
                cnt = 1;
            }
        }
        checkCnt();
        System.out.println(answer);
        br.close();
    }

    public static String checkCnt(){
        if(cnt != 1) answer += cnt;
        return answer;
    }
}
