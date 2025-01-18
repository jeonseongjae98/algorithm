import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        ArrayList<String> c = new ArrayList<>();
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i].toUpperCase();
            
            if(c.contains(city)){
                c.remove(city);
                c.add(city);
                answer+=1;
            }
            else{
            
                if(c.size() == cacheSize){
                    c.remove(0);
            }
                c.add(city);
                answer+=5;
        }
            
        }
        
        
        
        return answer;
    }
}