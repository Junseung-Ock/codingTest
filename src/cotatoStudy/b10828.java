package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class b10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")) {
                int v = Integer.parseInt(st.nextToken());
                list.add(v);
            } else if(op.equals("top")) {
                if(list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.getLast());
                }
            } else if(op.equals("empty")) {
                if(list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(op.equals("size")) {
                System.out.println(list.size());
            } else if(op.equals("pop")) {
                if(list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.removeLast());
                }
            }
        }
    }
}
