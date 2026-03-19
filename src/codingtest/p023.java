package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p023 {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N];
        visited = new boolean[N];
        int answer = 0;
        for(int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s-1].add(e-1);
        }
        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
    static void dfs(int start) {
        for(int next : graph[start]) {
            if(!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }
}
