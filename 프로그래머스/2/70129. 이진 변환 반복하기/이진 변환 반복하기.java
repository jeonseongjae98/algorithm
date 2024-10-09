class Solution {
    private int countZeros(String s){
        int z = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                z++;
            }
            
        }
        return z;
    }
    public int[] solution(String s) {
        int l = 0;
        int removed = 0;
        while (!s.equals("1")){
            int z = countZeros(s);
            l++;
            removed += z;
            int one = s.length() - z;
            s = Integer.toString(one, 2);
        }
        return new int[] {l, removed};
    }
}