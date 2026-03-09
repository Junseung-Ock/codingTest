package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        int[] arr = new int[N];
        int answer = 0;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(s.charAt(i)+"");
            answer += arr[i];
        }
        System.out.println(answer);
    }
}
