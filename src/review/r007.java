package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class r007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int s = 0;
        int e = N-1;
        int count = 0;
        while(s<e) {
            if(arr[s]+arr[e]==M) {
                count++;
                s++;
                e--;
            }
            if(arr[s]+arr[e] > M) {
                e--;
            }
            if(arr[s]+arr[e] < M) {
                s++;
            }
        }
        System.out.println(count);
    }
}
