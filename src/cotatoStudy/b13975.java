package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b13975 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                pq.add(Long.parseLong(st.nextToken()));
            }
            long answer = 0;
            while(true) {
                if(pq.size()==1) {
                    break;
                }
                long n1 = pq.poll();
                long n2 = pq.poll();
                long temp = n1 + n2;
                answer += temp;
                pq.add(temp);
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
