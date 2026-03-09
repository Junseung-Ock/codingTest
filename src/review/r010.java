package review;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class r010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Node> d = new LinkedList<>();
        for(int i=0; i<N; i++) {
            while(!d.isEmpty() && d.peekLast().v > arr[i]) {
                d.removeLast();
            }
            d.add(new Node(arr[i], i));
            if(i - d.peekFirst().idx >= L) {
                d.removeFirst();
            }
            bw.write(d.peekFirst().v+" ");
        }
        bw.flush();
        bw.close();
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
