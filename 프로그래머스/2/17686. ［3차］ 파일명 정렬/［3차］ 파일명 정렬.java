import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2)-> {
            String[] p1 = splitf(file1);
            String[] p2 = splitf(file2);
            
            int hcompare = p1[0].compareToIgnoreCase(p2[0]);
            if(hcompare != 0){
                return hcompare;
            }
            int n1 = Integer.parseInt(p1[1]);
            int n2 = Integer.parseInt(p2[1]);
            return Integer.compare(n1, n2);
            
        });
        
        return files;

    }
    private String[] splitf(String file){
        String h = "";
        String n = "";
        int index = 0;
        
        while(index < file.length() && !Character.isDigit(file.charAt(index))){
            h += file.charAt(index);
            index++;
        }
        while(index < file.length() && Character.isDigit(file.charAt(index)) && n.length()<5){
            n += file.charAt(index);
            index++;
        }
        
        return new String[] {h, n};
    }
}