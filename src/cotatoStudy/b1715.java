package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            if(pq.size() == 1) {
                break;
            }
            int n1 = pq.poll();
            int n2 = pq.poll();
            int temp = n1 + n2;
            sum += temp;
            pq.add(temp);
        }
        System.out.println(sum);
    }
}
