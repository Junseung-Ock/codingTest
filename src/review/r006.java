package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int s = 1;
        int e = 1;
        int sum = 0;
        while(s<N) {
            if(sum >= N) {
                sum -= s;
                s++;
            }
            if(sum < N) {
                sum += e;
                e++;
            }
            if(sum == N) {
                count++;
            }
        }
        System.out.println(count);
    }
}
