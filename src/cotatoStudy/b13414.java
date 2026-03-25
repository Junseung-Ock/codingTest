package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new LinkedHashSet<>();
        for(int i=0; i<M; i++) {
            String code = br.readLine();
            if(set.contains(code)) {
                set.remove(code);
            }
            set.add(code);
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(String code : set) {
            if(count == N) break;
            sb.append(code).append("\n");
            count++;
        }
        System.out.println(sb);
    }
}
