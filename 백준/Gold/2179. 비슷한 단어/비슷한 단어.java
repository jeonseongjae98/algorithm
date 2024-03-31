import java.util.*;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            String[] arr = new String[n];

            for(int i = 0; i < n; i++) {
                  arr[i] = sc.nextLine();
            }

            int max = Integer.MIN_VALUE;
            int ans1 = 0;
            int ans2 = 0;

            for(int i = 0; i < n-1; i++) {
                String s1 = arr[i];
                for(int j = i+1; j < n; j++) {
                    String s2 = arr[j];
                    int count = 0;

                    count = check(s1, s2);
                    if(count > max){
                        max = count;
                        ans1 = i;
                        ans2 = j;
                    }
                }
            }
            System.out.println(arr[ans1]);
            System.out.println(arr[ans2]);

      }

      static int check(String s1, String s2) {
            int count = 0;
          int size = Math.min(s1.length(), s2.length());
          for(int i = 0; i < size; i++) {
                  if(s1.charAt(i) == s2.charAt(i)) {
                        count++;
                  }else{
                        break;
                  }
            }
            return count;
      }
}
