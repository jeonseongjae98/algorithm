import java.util.*;
import java.io.*;
/**
 * @author HEESOO
 *
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int p=sc.nextInt();	
		ArrayList<Integer> list=new ArrayList<>(); // 숫자 순서대로 저장
		HashSet<Integer> set=new HashSet<>(); // 숫자 중복 체크
		list.add(a);
		set.add(a);
		
		while(true) {
			int num=makeNum(a, p); // 다음 숫자 계산
			if(set.contains(num)) { // 반복 찾음
				System.out.println(list.indexOf(num));
				break;
			}
			// 새로운 숫자일 경우 set, list에 add
			set.add(num);
			list.add(num);
			a=num;
		}
	}
	
	public static int makeNum(int a, int p) {
		int sum=0;
		while(a>0) {
			sum+=Math.pow(a%10, p);
			a/=10;
		}
		
		return sum;
	}
}