package cotatoStudy;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class b16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, List<String>> map = new HashMap<>();
        Map<String, String> PtoTmap = new HashMap<>();
        for(int i=0; i<N; i++) {
            String group = br.readLine();
            int num = Integer.parseInt(br.readLine());
            List<String> list = new LinkedList<>();
            for(int j=0; j<num; j++) {
                String name = br.readLine();
                list.add(name);
                PtoTmap.put(name, group);
            }
            Collections.sort(list);
            map.put(group, list);
        }
        for(int i=0; i<M; i++) {
            String input = br.readLine();
            int flag = Integer.parseInt(br.readLine());
            if(flag == 0) {
                for(String name : map.get(input)) {
                    System.out.println(name);
                }
            } else {
                System.out.println(PtoTmap.get(input));
            }
        }
    }
}