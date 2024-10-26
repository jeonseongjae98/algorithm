import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int maxSize = -1;
        
        Arrays.sort(mats);
        
        // 큰 매트부터 시작하여 작은 매트로 가도록 함
        for (int m = mats.length - 1; m >= 0; m--) {
            int matSize = mats[m];
            boolean canPlace = false;

            for (int i = 0; i <= rows - matSize; i++) {
                for (int j = 0; j <= cols - matSize; j++) {
                    boolean allMinusOne = true;

                    // 현재 위치에서 매트를 놓을 수 있는지 확인
                    for (int x = i; x < i + matSize; x++) {
                        for (int y = j; y < j + matSize; y++) {
                            if (!park[x][y].equals("-1")) {
                                allMinusOne = false;
                                break;
                            }
                        }
                        if (!allMinusOne) {
                            break;
                        }
                    }

                    if (allMinusOne) {
                        canPlace = true;
                        break;
                    }
                }

                if (canPlace) {
                    maxSize = matSize;
                    break;
                }
            }

            if (canPlace) {
                break;
            }
        }

        return maxSize;
    }
}
