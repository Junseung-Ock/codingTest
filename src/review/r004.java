package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        int[][] sum = new int[N+1][N+1];
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(i==0) {
                    sum[i+1][j+1] += arr[i][j] + sum[i+1][j];
                } else if(j==0) {
                    sum[i+1][j+1] += arr[i][j] + sum[i][j+1];
                } else {
                    sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] + arr[i][j] - sum[i][j];
                }
            }
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            System.out.println(sum[endX][endY] - sum[endX][startY-1] - sum[startX-1][endY] + sum[startX-1][startY-1]);
        }
    }
}
