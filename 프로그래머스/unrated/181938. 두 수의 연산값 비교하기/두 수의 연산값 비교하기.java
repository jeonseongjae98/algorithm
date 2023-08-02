class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 0;
        int d = 0;
        String f = "";
        c = 2 * a * b;
        f = Integer.toString(a) + Integer.toString(b);
        d = Integer.valueOf(f);
        if(c >= d){
            return c;
        }
        else{
            return d;
        }
        
    }
}