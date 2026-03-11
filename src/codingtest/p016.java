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
        Arrays.sort(arr, (Node a, Node b) -> Integer.compare(a.v, b.v));
        int max = 0;
        for(int i=0; i<N; i++) {
            if(max < arr[i].idx - i) {
                max = arr[i].idx - i;
            }
        }
        System.out.println(max+1);
    }

    public static class Node {
        int v;
        int idx;

        public Node(int v, int idx) {
            this.v = v;
            this.idx = idx;
        }
    }
}
