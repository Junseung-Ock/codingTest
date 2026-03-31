package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b10845 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            } else if(op.equals("front")) {
                if(q.isEmpty()) System.out.println(-1);
                else System.out.println(q.getFirst());
            } else if(op.equals("back")) {
                if(q.isEmpty()) System.out.println(-1);
                else System.out.println(q.getLast());
            } else if(op.equals("empty")) {
                if(q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if(op.equals("size")) {
                System.out.println(q.size());
            } else if(op.equals("pop")) {
                if(q.isEmpty()) System.out.println(-1);
                else System.out.println(q.removeFirst());
            }
        }
    }
}
