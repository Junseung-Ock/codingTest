package programmers.brute_force_search.find_primeNumber;

import java.util.*;

class Solution {
    boolean[] visited;
    // 메모리 효율과 중복 제거를 위해 Set 사용
    Set<Integer> primeSet = new HashSet<>();
    int length;

    public int solution(String numbers) {
        length = numbers.length();
        visited = new boolean[length];

        // DFS 시작
        dfs("", numbers);

        return primeSet.size();
    }

    void dfs(String current, String numbers) {
        if (!current.isEmpty()) {
            int n = Integer.parseInt(current);
            if (isPrime(n)) primeSet.add(n); // 소수면 Set에 추가 (중복 자동 제거)
        }

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false; // 0과 1 예외 처리
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
