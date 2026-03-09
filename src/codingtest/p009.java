package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p009 {

    static String dna;
    static int[] count;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine());
        int s =  Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        dna =  br.readLine();
        int[] minimum = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < minimum.length; i++){
            minimum[i] = Integer.parseInt(st.nextToken());
        }
        answer = 0;
        count = new  int[4];
        int flag = 0;
        int start=0;
        int end=p-1;
        for(int i=start; i<=end; i++){
            if(dna.charAt(i) == 'A') count[0]++;
            if(dna.charAt(i) == 'C') count[1]++;
            if(dna.charAt(i) == 'G') count[2]++;
            if(dna.charAt(i) == 'T') count[3]++;
        }
        for(int i = 0; i < minimum.length; i++){
            if(minimum[i] <= count[i]) {
                flag++;
            }
        }
        if(flag==4) answer++;
        for(int i=p; i<=s-1; i++ ){
            int k = i-p;
            flag = 0;
            add(i);
            remove(k);
            for(int j = 0; j < minimum.length; j++){
                if(minimum[j] <= count[j]) {
                    flag++;
                }
            }
            if(flag==4) answer++;
        }
        System.out.println(answer);
    }

    public static void add(int i) {
        if(dna.charAt(i) == 'A') count[0]++;
        if(dna.charAt(i) == 'C') count[1]++;
        if(dna.charAt(i) == 'G') count[2]++;
        if(dna.charAt(i) == 'T') count[3]++;
    }

    public static void remove(int i) {
        if(dna.charAt(i) == 'A') count[0]--;
        if(dna.charAt(i) == 'C') count[1]--;
        if(dna.charAt(i) == 'G') count[2]--;
        if(dna.charAt(i) == 'T') count[3]--;
    }
}
