package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p021 {
    static int[] arr;
    static int[] tmp;
    static long answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        tmp = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mSort(0, N-1);
        System.out.println(answer);
    }
    private static void mSort(int s, int e) {
        if(e-s<1) return;

        int m = s + (e - s) / 2;
        mSort(s, m);
        mSort(m+1, e);

        int k = s;
        int idx1 = s;
        int idx2 = m+1;

        for(int i=s; i<=e; i++) {
            tmp[i] = arr[i];
        }

        while(idx1 <= m && idx2 <= e) {
            if(tmp[idx1] > tmp[idx2]) {
                arr[k] = tmp[idx2];
                answer += idx2 - k;
                k++;
                idx2++;
            } else {
                arr[k] = tmp[idx1];
                k++;
                idx1++;
            }
        }
        while(idx1 <= m) {
            arr[k] = tmp[idx1];
            k++;
            idx1++;
        }
        while(idx2 <= e) {
            arr[k] = tmp[idx2];
            k++;
            idx2++;
        }
    }
}
