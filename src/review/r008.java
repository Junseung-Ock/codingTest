package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class r008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int answer = 0;
        for(int i=1; i<N; i++) {
            int s = 0;
            int e = N-1;
            while(s<e) {
                if(i==s) {
                    s++;
                    continue;
                }
                if(i==e) {
                    e--;
                    continue;
                }
                if(arr[i]==arr[s]+arr[e]) {
                    answer++;
                    break;
                }
                if(arr[i]>arr[s]+arr[e]) {
                    s++;
                }
                else if(arr[i]<arr[e]+arr[s]) {
                    e--;
                }
            }
        }
        System.out.println(answer);
    }
}
