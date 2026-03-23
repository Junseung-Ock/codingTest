package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")) {
                set.add(name);
            } else if(status.equals("leave")) {
                set.remove(name);
            }
        }
        for(String name : set) {
            list.add(name);
        }
        Collections.sort(list);
        for(int i=list.size()-1; i>=0; i--) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
