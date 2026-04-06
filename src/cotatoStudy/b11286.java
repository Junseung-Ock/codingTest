package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            int cur = Integer.parseInt(br.readLine());
            if(cur != 0) {
                pq.add(new Node(cur, Math.abs(cur)));
            } else {
                if(pq.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(pq.poll().v+"\n");
                }
            }
        }
        System.out.println(sb);
    }

    static class Node implements Comparable<Node> {
        int v;
        int abv;

        public Node(int v, int abv) {
            this.v = v;
            this.abv = abv;
        }

        @Override
        public int compareTo(Node o) {
            if(this.abv != o.abv) return this.abv - o.abv;
            else return this.v - o.v;
        }
    }
}
