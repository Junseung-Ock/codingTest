package codingtest;

import java.io.*;
import java.util.Stack;

public class p011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean flag = true;
        for(int i=0; i<N; i++) {
            int cur = arr[i];
            if(cur >= num){
                while (cur >= num) {
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if(stack.peek() > cur) {
                    flag = false;
                    break;
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        if(flag) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
