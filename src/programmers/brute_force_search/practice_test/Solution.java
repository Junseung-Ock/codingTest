package programmers.brute_force_search.practice_test;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == p1[i%p1.length]) {
                c1++;
            }
            if(answers[i] == p2[i%p2.length]) {
                c2++;
            }
            if(answers[i] == p3[i%p3.length]) {
                c3++;
            }
        }
        int max = Math.max(c1, Math.max(c2, c3));
        List<Integer> list = new LinkedList<>();
        if(max == c1) list.add(1);
        if(max == c2) list.add(2);
        if(max == c3) list.add(3);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
