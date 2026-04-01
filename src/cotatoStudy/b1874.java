package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i=1; i<=N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(stack.isEmpty() || num>stack.peek()) {
                for(int j=max+1; j<=num; j++) {
                    stack.add(j);
                    sb.append("+").append("\n");
                }
                int cur = stack.pop();
                if(cur != num) {
                    System.out.println("NO");
                    return;
                }
                sb.append("-").append("\n");
                if(num > max) max = num;
            } else {
                int cur = stack.pop();
                if(cur != num) {
                    System.out.println("NO");
                    return;
                }
                sb.append("-").append("\n");
            }
        }
        System.out.println(sb);
    }
}
