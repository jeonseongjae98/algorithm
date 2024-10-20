import java.util.*;

class Solution {
    private static boolean[] visited;
    private static List<String> result = new ArrayList<>();
    
    
    public String[] solution(String[][] tickets) {
        
        visited = new boolean[tickets.length];
        
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(result);
        
        String[] answer = result.get(0).split(" ");
        return answer;
    }
    public static void dfs(int idx, String start, String route, String[][] tickets){
        if(idx == tickets.length){
            result.add(route);
            
            return;
                
        }
        
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i][0].equals(start) && !visited[i]) {
                visited[i] = true;
                dfs(idx + 1, tickets[i][1], route + " " + tickets[i][1], tickets);
                visited[i] = false;
                
            }
        }
        return;
    }
}
