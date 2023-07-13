import java.util.Scanner;
import java.util.Arrays;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] nums = new int[T];
		for (int i = 0; i < T; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[T/2]);
		

	}
}