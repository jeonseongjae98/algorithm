import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] grid = new char[m][n];
        
        // board 입력을 char 배열로 변환
        for (int i = 0; i < m; i++) {
            grid[i] = board[i].toCharArray();
        }
        
        int totalRemoved = 0;
        
        while (true) {
            // 제거할 블록 찾기
            boolean[][] marked = new boolean[m][n];
            boolean found = false;
            
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = grid[i][j];
                    if (c != ' ' && c == grid[i][j + 1] && c == grid[i + 1][j] && c == grid[i + 1][j + 1]) {
                        marked[i][j] = true;
                        marked[i][j + 1] = true;
                        marked[i + 1][j] = true;
                        marked[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }
            
            // 찾은 블록이 없다면 정지
            if (!found) break;
            
            // 블록 카운트 및 제거
            int removed = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (marked[i][j]) {
                        grid[i][j] = ' ';
                        removed++;
                    }
                }
            }
            totalRemoved += removed;
            
            // 블록 떨어뜨리기
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (grid[i][j] == ' ') {
                        // 다음 떨어질 블록 찾기
                        int k = i - 1;
                        while (k >= 0 && grid[k][j] == ' ') k--;
                        if (k >= 0) {
                            grid[i][j] = grid[k][j];
                            grid[k][j] = ' ';
                        }
                    }
                }
            }
        }
        
        return totalRemoved;
    }
}