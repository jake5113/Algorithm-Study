import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int max, min;

		int newNum = scan.nextInt();
		max = newNum;
		min = newNum;

		for (int i = 1; i < num; i++) {
			newNum = scan.nextInt();

			if (newNum > max)
				max = newNum;
			else if (newNum < min)
				min = newNum;
			
		}

		System.out.print(min + " " + max);

	}
}