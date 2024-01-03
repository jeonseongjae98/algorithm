class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrx = new int[10];
        int[] arry = new int[10];
        for(String x: X.split("")){
            arrx[Integer.parseInt(x)]++;
        }
        for(String y: Y.split("")){
            arry[Integer.parseInt(y)]++;
        }
        
        for(int i = 9; i >= 0; i--){
            while(arrx[i] > 0 && arry[i] > 0){
                arrx[i]--;
                arry[i]--;
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        if (answer.isEmpty()) {
            return "-1";
        }
        if (answer.replaceAll("0", "").isEmpty()) {
            return "0";
        }
        
        return answer;
        
    }
}