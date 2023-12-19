class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        char[][] arr = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++){
            String s = park[i];
            for(int j = 0; j < park[0].length(); j++){
                arr[i][j] = s.charAt(j);
                
                if(arr[i][j]=='S'){
                    x = i;
                    y = j;
                }
            }
        }
        
        for(String st : routes){
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            int dx = x;
            int dy = y;
            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    dy++;
                }
                if(way.equals("W")){
                    dy--;
                }
                if(way.equals("S")){
                    dx++;
                }
                if(way.equals("N")){
                    dx--;
                }
                
                if(dx >= 0 && dy >= 0 && dx < arr.length && dy < arr[0].length){
                    if(arr[dx][dy] == 'X'){
                        break;
                    }
                    if(i == (len - 1)){
                        x = dx;
                        y = dy;
                    }
                }
            }
            
        }
        int[] answer = {x, y};
        
        
        return answer;
    }
}