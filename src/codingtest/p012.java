package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
                answer[stack.pop()] = arr[i];
            }
            stack.add(i);
        }
        for(int i=0; i<N; i++) {
            if(answer[i] == 0) {
                answer[i] = -1;
            }
            sb.append(answer[i]+ " ");
        }
        System.out.println(sb);
    }
}
