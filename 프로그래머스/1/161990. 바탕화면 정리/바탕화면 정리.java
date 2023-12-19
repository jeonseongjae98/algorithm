import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        for(int i = 0; i < wallpaper.length; i++){
            String wall = wallpaper[i];
            for(int j = 0; j < wallpaper[i].length(); j++){
                arr[i][j] = wall.charAt(j);
            } 
        }// 입력 받기
            
        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        int maxy = Integer.MIN_VALUE;
            
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(arr[i][j] == '#'){
                    minx = Math.min(minx, i);
                    miny = Math.min(miny, j);
                    maxx = Math.max(maxx, i);
                    maxy = Math.max(maxy, j);
                }
                
            } 
            
            
            
            
            
        }
        
        answer = new int[]{minx, miny, maxx+1, maxy+1};
        return answer;
    }
}