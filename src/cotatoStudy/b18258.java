package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch(op) {
                case "push" :
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(q.removeFirst()).append("\n");
                    break;
                case "front" :
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(q.peekFirst()).append("\n");
                    break;
                case "back" :
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(q.peekLast()).append("\n");
                    break;
                case "empty" :
                    if(q.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "size" :
                    sb.append(q.size()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
