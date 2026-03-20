package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p024 {
    static int N;
    static String cur = "";
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        dfs(0);
        System.out.println(sb);
    }
    private static void dfs(int depth) {
        if(depth == N) {
            sb.append(cur).append("\n");
            return;
        }
        for(int i=0; i<10; i++) {
            int curNum = Integer.parseInt(cur+i);
            if(curNum == 0) continue;
            if(curNum == 1) continue;
            int count = 0;
            for(int j=1; j<=Math.sqrt(curNum); j++) {
                if(curNum%j==0) {
                    count++;
                }
            }
            if(count==1) {
                cur += String.valueOf(i);
                dfs(depth+1);
                cur = cur.substring(0, cur.length()-1);
            }
        }
    }
}
