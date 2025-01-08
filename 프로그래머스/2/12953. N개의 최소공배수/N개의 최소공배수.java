import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            int num = gcd(arr[i+1], arr[i]);
            arr[i+1] = (arr[i] * arr[i+1]) / num;
        }
        
        return arr[arr.length-1];
    }
    public static int gcd(int n1, int n2){
        if(n1 % n2 == 0){
            return n2;
        }
        else{
            return gcd(n2, n1%n2);
        }
    }
}