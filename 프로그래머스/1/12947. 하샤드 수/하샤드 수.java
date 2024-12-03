class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long n = 0;
        long y = x;
        while(y > 0){
            n += (y % 10);
            y /= 10;
        }
        if(x % n != 0){
            answer = false; 
        }      
        
        return answer;
    }
}