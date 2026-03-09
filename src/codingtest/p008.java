package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        for(int i=0; i<N; i++) {
            int startIdx = 0;
            int endIdx = N - 1;
            while(startIdx < endIdx) {
                if(startIdx == i) {
                    startIdx++;
                    continue;
                }
                if(endIdx == i) {
                    endIdx--;
                    continue;
                }
                if(arr[startIdx] + arr[endIdx] == arr[i]) {
                    count++;
                    break;
                } else if(arr[startIdx] + arr[endIdx] > arr[i]) {
                    endIdx--;
                } else {
                    startIdx++;
                }
            }
        }
        System.out.println(count);
    }
}
