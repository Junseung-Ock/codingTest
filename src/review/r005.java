package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] sum = new int[N+1];
        long[] count = new long[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i+1] = (sum[i] + arr[i]) % M;
            count[sum[i+1]]++;
        }
        long answer = count[0];
        for(int i=0; i<M; i++) {
            answer += (count[i] * (count[i]-1))/2;
        }
        System.out.println(answer);
    }
}
