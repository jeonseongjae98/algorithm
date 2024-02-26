import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        //주어진 조건을 만족하는 가장 큰 양의 정수 a를 return
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        //최대 공약수 구하기
        for(int i=1; i<arrayA.length; i++){
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }
        
        //나눌 수 없는지 확인
        if(!canDivide(arrayB, gcdA)){
            answer = Math.max(answer, gcdA);
        }
        
        if(!canDivide(arrayA, gcdB)){
            answer = Math.max(answer, gcdB);
        }
        
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    
    public static boolean canDivide(int[] array, int gcd){
        for(int num:array){
            if(num%gcd==0){
                return true;
            }
        }
        return false;
    }
}