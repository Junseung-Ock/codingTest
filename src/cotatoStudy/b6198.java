package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b6198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(br.readLine());
            while(!stack.isEmpty() && stack.peek() <= cur) {
                stack.pop();
            }
            answer += stack.size();
            stack.add(cur);
        }
        System.out.println(answer);
    }
}
