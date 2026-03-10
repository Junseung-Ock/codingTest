package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p013 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            q.add(i);
        }
        while(q.size() != 1) {
            q.remove();
            if(q.size() == 1) {
                break;
            }
            int re = q.remove();
            q.add(re);
        }
        System.out.println(q.peek());
    }
}
