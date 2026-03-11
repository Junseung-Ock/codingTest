package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node[] arr = new Node[N];
        int[] d = new int[N];
        for(int i=0; i<N; i++) {
            int cur = Integer.parseInt(br.readLine());
            arr[i] = new Node(cur, i);
        }
        Arrays.sort(arr);
        for(int i=0; i<N; i++) {
            d[i] = arr[i].idx - i;
        }
        Arrays.sort(d);
        System.out.println(d[N-1]+1);
    }

    public static class Node implements Comparable<Node> {
        int v;
        int idx;

        public Node(int v, int idx) {
            this.v = v;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.v, o.v);
        }
    }
}
