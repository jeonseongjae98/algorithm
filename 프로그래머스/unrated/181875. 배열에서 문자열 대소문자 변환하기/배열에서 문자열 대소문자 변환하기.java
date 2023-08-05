class Solution {
    public String[] solution(String[] strArr) {
        for(int idx=0; idx<strArr.length; idx++) {
            if(idx%2==0) {
                strArr[idx] = strArr[idx].toLowerCase();
            }
            else {
                strArr[idx] = strArr[idx].toUpperCase();
            }
        }
        return strArr;
    }
}