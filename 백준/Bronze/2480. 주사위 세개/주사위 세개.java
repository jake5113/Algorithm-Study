import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2, num3, result;
		int[] nums = new int[3];

		nums[0] = scan.nextInt();
		nums[1] = scan.nextInt();
		nums[2] = scan.nextInt();
		
		if (nums[0] == nums[1] && nums[1] == nums[2]) {
			System.out.println(10000 + 1000 * nums[0]);
		} else if (nums[0] == nums[1] && nums[0] != nums[2]) {
			System.out.println(1000 + nums[0] * 100);
		} else if (nums[1] == nums[2] && nums[1] != nums[0]) {
			System.out.println(1000 + nums[1] * 100);

		} else if (nums[0] == nums[2] && nums[0] != nums[1]) {
			System.out.println(1000 + nums[0] * 100);
		} else {
			int max = nums[0];
			for (int i = 0; i < nums.length; i++) {
				if (max < nums[i]) {
					max = nums[i];
				}
			}
			System.out.println(100 * max);
		}
	}
}
