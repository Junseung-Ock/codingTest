package programmers.brute_force_search.minimum_bounding_rectangle;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max0 = 0;
        int max1 = 0;
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > max0) max0 = sizes[i][0];
            if(sizes[i][1] > max1) max1 = sizes[i][1];
        }
        answer = max0 * max1;
        return answer;
    }
}