import java.util.*;

class Solution {

    public int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0]; // 추가 체력 기준
        int now = health; // 현재 체력
        int std = 0; // 마지막으로 공격당한 시간

        int v1, v2; // 추가 체력 받을 수 있나?
        for (int[] atk: attacks) {
            if (now <= 0) {
                return -1;
            }

            v1 = atk[0] - std - 1; // 시간 차이
            v2 = v1 / cnt; // 추가 체력 회수

            // 맞기 직전까지의 체력 정산
            std = atk[0];
            now = Math.min(health, now + (v1 * bandage[1]));
            now = Math.min(health, now + (v2 * bandage[2]));

            now -= atk[1];
        }        

        return now <= 0 ? -1 : now;
    }
}