package cotatoStudy;

import java.util.*;
import java.lang.*;
import java.io.*;

class b1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        for(int i=1; i<=N; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }
        for(int i=0; i<M; i++) {
            String input = br.readLine();
            if(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
                sb.append(map.get(input)).append("\n");
            } else {
                sb.append(arr[Integer.parseInt(input)]).append("\n");
            }
        }
        System.out.println(sb);
    }
}