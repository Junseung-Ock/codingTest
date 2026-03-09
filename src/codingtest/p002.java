package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int res[] = new int[num];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0; i < num; i++){
            res[i] = Integer.parseInt(st.nextToken());
            if(res[i] > max){
                max = res[i];
            }
        }
        float sum = 0;
        for(int i = 0; i < num; i++){
            sum += (float) res[i]/max*100;
        }
        System.out.println(sum/3);
    }
}
