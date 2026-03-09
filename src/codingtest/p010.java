package codingtest;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Node> q = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            if(!q.isEmpty() && i - q.peekFirst().idx >= L) {
                q.removeFirst();
            }
            while(!q.isEmpty() && q.peekLast().val > arr[i]){
                q.removeLast();
            }
            q.addLast(new Node(i, arr[i]));
            bw.write(q.peekFirst().val + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        int idx;
        int val;

        public Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
