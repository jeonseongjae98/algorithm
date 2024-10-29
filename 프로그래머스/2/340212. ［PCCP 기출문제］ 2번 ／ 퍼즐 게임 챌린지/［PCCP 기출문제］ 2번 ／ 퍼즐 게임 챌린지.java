class Solution {
    
    static boolean levelcheck(int[] diffs, int[] times, long level, long limit){
        long t = (long) times[0];
        
        for(int i = 1; i < times.length; i++){
            if(diffs[i] > level){
                t += ((long) diffs[i] - level) * ((long)times[i-1] + (long)times[i]);
            }
            t += (long)times[i];
        }
        return limit < t;
    }
    
    public int solution(int[] diffs, int[] times, long limit) {
        long left = 1;
        long right = limit;
         while(left < right){
             long mid = (left + right) / 2;
             
             if(levelcheck(diffs, times, mid, limit)){
                 left = mid + 1;
                 
             }else{
                 right = mid;
             }
             
         }
        
        
        
        return (int) left;
    }
}