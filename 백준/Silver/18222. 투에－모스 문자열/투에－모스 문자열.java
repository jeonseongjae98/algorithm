import java.util.*;

public class Main {
    static long[] arr = new long[64];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        //1. 처음 2^n개의 원소가 한번 결정되어 문자열 s를 형성하면,
        for (int i = 0; i < arr.length; i++) {
			arr[i] = (long)Math.pow(2, i); 
		}
       
        System.out.println(solv(k));
    }

    public static int solv(long k) {
        if (k == 1)  return 0;//2. 다음 2^n개의 원소는 s의 비트 단위 NOT으로 형성된다. t2n= tn
        
        long N = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) N = arr[i];
            else break;
            
        }
        return 1 - solv(k - N);//3. 이제 처음 2^n+1개의 원소를 정의했으므로 재귀한다. t2n+1= 1 − tn.

    }

}