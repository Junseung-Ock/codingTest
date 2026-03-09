package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String dna = br.readLine();
        int[] limit = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            limit[i] = Integer.parseInt(st.nextToken());
        }
        int[] count = new int[4];
        int answer = 0;
        int s=0;
        int e=0;
        while(e<S) {
            if(e-s < P) {
                if(dna.charAt(e)=='A') {
                    count[0]++;
                }
                if(dna.charAt(e)=='C') {
                    count[1]++;
                }
                if(dna.charAt(e)=='G') {
                    count[2]++;
                }
                if(dna.charAt(e)=='T') {
                    count[3]++;
                }
                e++;
            }
            if(e-s == P) {
                int flag = 0;
                for(int i=0; i<4; i++) {
                    if(count[i]>=limit[i]) {
                        flag++;
                    }
                }
                if(flag == 4) {
                    answer++;
                }
                if(dna.charAt(s)=='A') {
                    count[0]--;
                }
                if(dna.charAt(s)=='C') {
                    count[1]--;
                }
                if(dna.charAt(s)=='G') {
                    count[2]--;
                }
                if(dna.charAt(s)=='T') {
                    count[3]--;
                }
                s++;
            }
        }
        System.out.println(answer);
    }
}
