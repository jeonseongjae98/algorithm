import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            // file1과 file2를 HEAD, NUMBER, TAIL로 분할
            String[] parts1 = splitFileName(file1);
            String[] parts2 = splitFileName(file2);

            // HEAD를 비교(대소문자 구분 x)
            int headCompare = parts1[0].compareToIgnoreCase(parts2[0]);
            if (headCompare != 0) {
                return headCompare;
            }

            // NUMBER를 정수로 비교
            int number1 = Integer.parseInt(parts1[1]);
            int number2 = Integer.parseInt(parts2[1]);
            return Integer.compare(number1, number2);
        });

        return files;
    }
    
    // 파일 이름을 HEAD, NUMBER, TAIL로 분할하는 메서드
    private String[] splitFileName(String file) {
        String head = "";
        String number = "";
        int index = 0;

        // HEAD 추출
        while (index < file.length() && !Character.isDigit(file.charAt(index))) {
            head += file.charAt(index);
            index++;
        }

        // NUMBER 추출(최대 5글자)
        while (index < file.length() && Character.isDigit(file.charAt(index)) && number.length() < 5) {
            number += file.charAt(index);
            index++;
        }

        return new String[] { head, number };
    }
}