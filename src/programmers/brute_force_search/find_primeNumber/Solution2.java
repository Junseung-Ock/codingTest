package programmers.brute_force_search.find_primeNumber;

import java.util.*;

class Solution2 {
    // 중복된 숫자를 방지하기 위해 Set 사용
    HashSet<Integer> numberSet = new HashSet<>();

    public int solution2(String numbers) {
        // 1. 모든 숫자 조합 만들기 (재귀 함수 호출)
        recursive("", numbers);

        // 2. 소수의 개수 세기
        int count = 0;
        Iterator<Integer> it = numberSet.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (isPrime(number)) {
                count++;
            }
        }

        return count;
    }

    /**
     * 모든 숫자 조합을 생성하는 재귀 함수
     * @param comb 현재까지 조합된 문자열
     * @param others 남은 숫자들
     */
    public void recursive(String comb, String others) {
        // 현재 조합된 숫자를 Set에 추가 (빈 문자열 제외)
        if (!comb.equals("")) {
            numberSet.add(Integer.parseInt(comb));
        }

        // 남은 숫자 중 하나를 선택해 새로운 조합 생성
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i),
                    others.substring(0, i) + others.substring(i + 1));
        }
    }

    /**
     * 소수 여부를 판별하는 함수
     */
    public boolean isPrime(int num) {
        // 0과 1은 소수가 아님
        if (num == 0 || num == 1) return false;

        // 에라토스테네스의 체 원리: 루트 n까지만 확인
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
