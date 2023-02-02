import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] nums = new int[num];
		int count = 0, v;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		v = scan.nextInt();
		for (int i : nums) {
			if (i == v) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}