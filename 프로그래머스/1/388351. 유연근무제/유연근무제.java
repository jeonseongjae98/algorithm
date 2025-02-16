class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0;i<schedules.length;i++){
            int limit = plusTime(schedules[i]);
            boolean pass = true;
            for(int j=0;j<timelogs[i].length;j++){
                if(((startday+j)%7>0 && (startday+j)%7<6)){
                    if(limit<timelogs[i][j]){
                        pass = false;
                        break;
                    }
                }
            }
            if(pass) answer++;
        }
        return answer;
    }
    
    public int plusTime(int time){
        time +=10;
        if(time%100>=60)
            time +=40;
        return time;
    }
}