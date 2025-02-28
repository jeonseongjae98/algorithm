import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        
        // 전화번호를 해시맵에 저장
        for (String phoneNumber : phone_book) {
            map.put(phoneNumber, 1);
        }
        
        // 각 전화번호에 대해 접두사 여부 확인
        for (String phoneNumber : phone_book) {
            for (int j = 1; j < phoneNumber.length(); j++) {
                if (map.containsKey(phoneNumber.substring(0, j))) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}
