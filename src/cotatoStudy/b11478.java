package cotatoStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class b11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = s.length();
        Set<String> set = new LinkedHashSet<>();
        for(int i=1; i<N; i++) {
            for(int j=0; j<=N-i; j++) {
                set.add(s.substring(j, j + i));
            }
        }
        System.out.println(set.size()+1);
    }
}
