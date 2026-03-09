package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = N-1;
        while(startIndex<endIndex) {
            if(arr[startIndex] + arr[endIndex] == M){
                count++;
                startIndex++;
                endIndex--;
            } else if(arr[startIndex] + arr[endIndex] < M){
                startIndex++;
            } else {
                endIndex--;
            }
        }
        System.out.println(count);
    }
}
