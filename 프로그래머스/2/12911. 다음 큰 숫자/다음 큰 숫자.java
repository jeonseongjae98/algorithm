class Solution {
    public int solution(int n) {
        int answer = 0;
        int nc = Integer.bitCount(n);
        
        while(true){
            n++;
            int nec = Integer.bitCount(n);
            
            if(nec == nc){
                break;
            }
        }
        answer = n;
        
        
        return answer;
    }
}