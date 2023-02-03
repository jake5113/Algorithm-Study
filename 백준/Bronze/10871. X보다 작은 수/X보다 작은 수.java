import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int maxNum = scan.nextInt();

		for (int i = 0; i < num; i++) {
			int a = scan.nextInt();
			if (maxNum > a)
				list.add(a);
		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
}