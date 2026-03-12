package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        Integer[] arr = new Integer[num.length()];
        for(int i=0; i<num.length(); i++) {
            arr[i] = Integer.parseInt(num.charAt(i)+"");
        }
        Arrays.sort(arr, (Integer a, Integer b) -> b - a);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num.length();i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
