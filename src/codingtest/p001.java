package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        String nums = br.readLine();
        int answer = 0;
        for(int i=0; i<num; i++) {
            answer += Integer.parseInt(nums.charAt(i)+"");
        }
        System.out.println(answer);
    }
}
