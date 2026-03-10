package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(pq.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(pq.remove().v).append("\n");
                }
            } else {
                if(num < 0) {
                    pq.add(new Node(num, -num));
                } else {
                    pq.add(new Node(num, num));
                }
            }
        }
        System.out.println(sb);
    }

    public static class Node implements Comparable<Node> {
        int v;
        int abv;

        public Node(int v, int abv) {
            this.v = v;
            this.abv = abv;
        }

        @Override
        public int compareTo(Node o) {
            if(this.abv == o.abv) return Integer.compare(this.v, o.v);
            else return Integer.compare(this.abv, o.abv);
        }
    }
}
