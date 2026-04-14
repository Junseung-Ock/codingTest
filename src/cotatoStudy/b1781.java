package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b1781 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Node> pq = new PriorityQueue<>();
        PriorityQueue<Node> result = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.num - o2.num;
            }
        });
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int deadLine = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            pq.add(new Node(deadLine, num));
        }
        int curDeadLine = 1;
        int answer = 0;
        while(!pq.isEmpty()) {
            if(pq.peek().deadLine == curDeadLine) {
                Node cur = pq.poll();
                if(result.size() < curDeadLine) {
                    result.add(cur);
                } else if(result.size()==curDeadLine) {
                    if(result.peek().num < cur.num) {
                        result.poll();
                        result.add(cur);
                    }
                }
            } else curDeadLine++;
        }
        for(Node n : result) {
            answer += n.num;
        }
        System.out.println(answer);
    }

    static class Node implements Comparable<Node> {
        int deadLine;
        int num;

        @Override
        public int compareTo(Node o) {
            if(this.deadLine == o.deadLine) return o.num - this.num;
            else return this.deadLine - o.deadLine;
        }

        public Node(int deadLine, int num) {
            this.deadLine = deadLine;
            this.num = num;
        }
    }
}
