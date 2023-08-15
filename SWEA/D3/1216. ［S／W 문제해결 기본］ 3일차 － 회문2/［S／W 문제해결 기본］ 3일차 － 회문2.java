import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {// 총 10개의 테스트 케이스를 처리
        	int t = Integer.parseInt(br.readLine());  // 테스트 케이스 번호 입력
        	char[][] a = new char[100][100]; // 100x100 크기의 문자열 배열
        	for(int i = 0; i < 100; i++) {
        		String s = br.readLine();
        		for (int j = 0; j < 100; j++) {  
        			a[i][j] = s.charAt(j); // 문자열 배열에 각각의 문자 입력
        		}
        	}
        	int max = 0;  // 현재 테스트 케이스에서 가장 긴 팰린드롬 패턴의 길이
            for (int s = 0; s < 100; s++) {  // 문자열 배열의 시작 위치
                for (int e = 99; e > s + max - 1; e--) {  // 문자열 배열의 끝 위치
                    int len = e - s + 1;  // 패턴의 길이 계산
                    int half = len / 2;  // 패턴 길이의 반
                    for (int i = 0; i < 100; i++) {  // 문자열 배열의 행 반복
                        boolean flag = true;
                        for (int j = 0; j < half; j++) {
                            if (a[i][s + j] != a[i][e - j]) {  // 가로 방향 팰린드롬 검사
                                flag = false;
                                break;
                            }
                        }
                       
                        if (flag == true && len > max) {
                        	max = len;  // 현재 패턴 길이가 최대 길이보다 크면 업데이트
                        }
                    }
                    
                    for (int i = 0; i < 100; i++) {  // 문자열 배열의 열 반복
                        boolean flag = true;
                        for (int j = 0; j < half; j++) {
                            if (a[s + j][i] != a[e - j][i]) {  // 세로 방향 팰린드롬 검사
                                flag = false;
                                break;
                            }
                        }
                    
                        if (flag == true && len > max) {
                        	max = len;  // 현재 패턴 길이가 최대 길이보다 크면 업데이트
                        }
                    }
                }
            }
            
            System.out.printf("#%d %d\n", t, max);  // 테스트 케이스 번호와 최대 패턴 길이 출력
        }
    }
}
    