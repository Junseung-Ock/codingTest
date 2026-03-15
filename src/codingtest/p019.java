package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p019 {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(0, N-1, K-1);
        System.out.println(arr[K-1]);
    }

    public static void quickSort(int start, int end, int K) {
        if(start < end) {
            int pivot  = partition(start, end);
            if(pivot == K) {
                return;
            } else if(K < pivot) {
                quickSort(start, pivot - 1, K);
            } else {
                quickSort(pivot + 1, end, K);
            }
        }
    }

    public static int partition(int start, int end) {
        if(start + 1 == end) {
            if(arr[start] > arr[end]) {
                swap(start, end);
            }
            return end;
        }
        int mid = (start + end) / 2;
        swap(start, mid);
        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while(i <= j) {
            while(i <= end && arr[i] < pivot) {
                i++;
            }
            while(j > start && arr[j] > pivot) {
                j--;
            }
            if(i <= j) {
                swap(i++, j--);
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
