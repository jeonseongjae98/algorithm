import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp = "";
        
        while(n != 0){
            temp = n%k + temp;
            n/=k;
        } // k진법 변환
        String[] arr = temp.split("0");
        for(String a : arr){
            if(a.equals("")){
                continue;
            }
            long num = Long.parseLong(a);
            
            if(isPrime(num)){
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
    
    public static boolean isPrime(long num) {
        if(num<2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
}