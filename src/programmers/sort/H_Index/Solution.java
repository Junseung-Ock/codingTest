package programmers.sort.H_Index;

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] count = new int[10001];
        for(int i=0; i<citations.length; i++) {
            count[citations[i]]++;
        }
        int h = 0;
        for(int i=10000; i>=0; i--) {
            h += count[i];
            if(i <= h) {
                answer = i;
                return answer;
            }
        }
        return 0;
    }
}
