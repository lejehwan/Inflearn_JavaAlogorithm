package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();
        Queue<Character> queue = new LinkedList<Character>();
        Stack<Character> stack = new Stack<Character>();
        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            if (!(97 <= ch[i] && ch[i] <= 122) && !(65 <= ch[i] && ch[i] <= 90)) {
                queue.offer(ch[i]);
            }else{
                stack.push(ch[i]);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (!(97 <= ch[i] && ch[i] <= 122) && !(65 <= ch[i] && ch[i] <= 90)) {
                answer += queue.poll();
            }else{
                answer += stack.pop();
            }
        }
        System.out.println(answer);
        br.close();
    }
}
