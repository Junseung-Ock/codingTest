package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            Map<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0)+1);
            }
            int answer = 1;
            for(Integer count : map.values()) {
                answer *= (count+1);
            }
            System.out.println(answer-1);
        }
    }
}
