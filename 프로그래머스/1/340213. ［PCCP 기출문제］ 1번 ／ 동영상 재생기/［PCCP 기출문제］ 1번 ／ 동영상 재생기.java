class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_length = Integer.parseInt(video_len.split(":")[0])*60 
                         + Integer.parseInt(video_len.split(":")[1]);
         int video_start  = Integer.parseInt(pos.split(":")[0]) * 60
                         + Integer.parseInt(pos.split(":")[1]);

        int ad_start     = Integer.parseInt(op_start.split(":")[0]) * 60
                         + Integer.parseInt(op_start.split(":")[1]);

        int ad_end       = Integer.parseInt(op_end.split(":")[0]) * 60
                         + Integer.parseInt(op_end.split(":")[1]); 
        
        if(video_start >= ad_start 
        && video_start <= ad_end){
            video_start = ad_end;
        };
        
        for(int i=0; i<commands.length; i++) {
            int command = 0;
            if(commands[i].equals("next")){
            command = 10;
                }
            else{
                command = -10; }
            
             video_start += command;
            if(video_start < 0){
                video_start = 0;
            }
            else if(video_start > video_length){
                video_start = video_length;
        }
         if(video_start >= ad_start && video_start <= ad_end) {
                video_start = ad_end;   
            }
        }
        String newMinutes = String.format("%02d", video_start / 60);
        String newSeconds = String.format("%02d", video_start % 60);

         return newMinutes + ":" + newSeconds;
    }
}