package programmers.sort.H_Index;

import java.util.Arrays;

class Solution2 {
    public int solution2(int[] citations) {
        int answer = 0;

        // 1. 논문 인용 횟수를 오름차순으로 정렬
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // 2. h 후보가 될 수 있는 '현재 논문을 포함한 남은 논문의 개수' 계산
            // i번째 논문이 citations[i]번 인용되었다면,
            // citations[i]번 이상 인용된 논문은 (n - i)편입니다.
            int h = n - i;

            // 3. 인용 횟수(citations[i])가 논문 수(h)보다 크거나 같은 순간이
            // H-Index의 조건을 만족하는 지점입니다.
            if (citations[i] >= h) {
                answer = h;
                break; // 최댓값을 찾는 것이므로 조건을 만족하는 즉시 종료
            }
        }

        return answer;
    }
}
