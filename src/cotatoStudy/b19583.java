package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        int answer = 0;
        String start = st.nextToken();
        String end = st.nextToken();
        String sEnd = st.nextToken();
        String chat;
        while((chat = br.readLine()) != null) {
            st = new StringTokenizer(chat);
            if(st.countTokens() != 2) break;
            String time = st.nextToken();
            String name = st.nextToken();
            if(time.compareTo(start) <= 0) {
                set.add(name);
            }
            if(time.compareTo(end) >= 0 && time.compareTo(sEnd) <=0) {
                if(set.contains(name)) {
                    set.remove(name);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
