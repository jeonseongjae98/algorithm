import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        int n = players.length;
        Map<String, Integer> ranking = new HashMap<>();
        for(int i = 0; i < n; i++){
            ranking.put(players[i], i);
            
        }// 순서를 넣기
        
        for(String player : callings){
            int playerRanking = ranking.get(player);
            
            String frontPlayer = players[playerRanking - 1];
            
            ranking.put(frontPlayer, playerRanking);
            players[playerRanking] = frontPlayer;
            
            ranking.put(player, playerRanking-1);
            players[playerRanking-1] = player;
            
        }
        return players;
    }
}