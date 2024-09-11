import java.util.Set;
import java.util.TreeSet;

class Solution {
    Set<String> set;
    String[] arr = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        set = new TreeSet<>(); // 제네릭 타입 명시

        // 첫 글자들을 시작으로 모든 가능한 조합을 생성
        for (int i = 0; i < 5; i++) {
            makeword(arr[i], 1);
        }

        // 사전 순서대로 탐색하며 word와 같은지 확인
        int count = 0;
        for (String s : set) {
            count++;
            if (s.equals(word)) {
                return count; // word를 찾으면 그 순서를 반환
            }
        }

        // 만약 word를 찾지 못하면 0을 반환 (실제 문제에선 발생하지 않을 조건)
        return 0;
    }

    public void makeword(String base, int depth) {
        set.add(base); // 단어를 set에 추가
        if (depth == 5) { // 최대 깊이 5에 도달하면 리턴
            return;
        }

        // 재귀적으로 새로운 단어 생성
        for (int i = 0; i < 5; i++) {
            makeword(base + arr[i], depth + 1);
        }
    }
}
