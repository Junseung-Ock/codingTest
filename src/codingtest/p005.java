package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        int sum[] = new int[N + 1];
        long count[] = new long[M];
        long answer = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i + 1] = (sum[i] + arr[i]) % M;
            if(sum[i + 1] == 0) {
                answer++;
            }
            count[sum[i + 1]]++;
        }
        for (int i = 0; i < M; i++) {
            answer += count[i] * (count[i] - 1) / 2;
        }
        System.out.println(answer);
    }
}
