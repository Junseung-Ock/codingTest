package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine());
        int dataNum = Integer.parseInt(st.nextToken());
        int queryNum = Integer.parseInt(st.nextToken());
        int nums[] = new int[dataNum];
        int sums[] = new int[dataNum + 1];
        Arrays.fill(sums, 0);
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < dataNum; i++){
            nums[i] = Integer.parseInt(st.nextToken());
            sums[i+1] += sums[i] +  nums[i];
        }
        for(int i = 0; i < queryNum; i++){
            st = new  StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sums[end] -  sums[start-1]);
        }
    }
}
