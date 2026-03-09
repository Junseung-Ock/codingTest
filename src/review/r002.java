package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        float[] arr = new float[N];
        float max = 0;
        float sum = 0;
        for(int i=0;i<N;i++) {
            arr[i] =  Integer.parseInt(st.nextToken());
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=0;i<N;i++) {
            arr[i] = arr[i]/max*100;
            sum+=arr[i];
        }
        System.out.println(sum/N);
    }
}
