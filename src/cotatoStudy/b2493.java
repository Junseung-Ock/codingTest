package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Node> stack = new Stack<>();
        sb.append("0 ");
        for(int i=1; i<=N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(!stack.isEmpty()) {
                while(!stack.isEmpty()) {
                    if(stack.peek().v <= num) {
                        stack.pop();
                        if(stack.isEmpty()) {
                            sb.append("0 ");
                        }
                    } else {
                        sb.append(stack.peek().idx+" ");
                        break;
                    }
                }
            }
            stack.add(new Node(num, i));
        }
        System.out.println(sb);
    }

    static class Node {
       int v;
       int idx;

       public Node(int v, int idx)  {
           this.v = v;
           this.idx = idx;
       }
    }
}
