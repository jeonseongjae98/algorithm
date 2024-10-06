import java.util.*;

class Solution {
        private List<String> split(String source, int length){
            List<String> tokens = new ArrayList<>();
            for(int si = 0; si < source.length(); si += length){
                int ei = si + length;
                if(ei > source.length()){
                    ei = source.length();
                }
                tokens.add(source.substring(si, ei));
                
            }
            return tokens;
        }
        
        private int compress(String source, int length){
            StringBuilder builder = new StringBuilder();
            
            String last = "";
            int count = 0;
            for(String token : split(source, length)){
                if(token.equals(last)){
                    count++;
                }
                else{
                    if(count > 1){
                        builder.append(count);
                    }
                    builder.append(last);
                        last = token;
                        count = 1;
                }
            }
            if(count > 1){
                builder.append(count);
            }
                builder.append(last);
            
                return builder.length();
            }
            
            public int solution(String s){
                int min = Integer.MAX_VALUE;
                for(int length = 1; length <= s.length(); length++){
                    int compressed = compress(s, length);
                    if(compressed < min){
                        min = compressed;
                    }
                }
                return min;
            }
        }