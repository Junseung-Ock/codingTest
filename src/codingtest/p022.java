package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Radix_sort(arr, 5);
        for(int i=0; i<N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void Radix_sort(int[] arr, int max_size) {
        int flag = 1;
        int[] output = new int[arr.length];
        int count = 0;
        while(count != max_size) {
            int[] bucket = new int[10];
            for(int i=0; i<arr.length; i++) {
                bucket[(arr[i]/flag)%10]++;
            }
            for(int i=1; i<10; i++) {
                bucket[i] += bucket[i-1];
            }
            for(int i=arr.length-1; i>=0; i--) {
                output[bucket[arr[i] / flag % 10]-1] = arr[i];
                bucket[arr[i] / flag % 10]--;
            }
            for(int i=0; i<arr.length; i++) {
                arr[i] = output[i];
            }
            flag = flag * 10;
            count++;
        }
    }
}
