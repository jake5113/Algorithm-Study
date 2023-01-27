import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int hour, min, spendMin;
		hour = scan.nextInt();
		min = scan.nextInt();
		spendMin = scan.nextInt();

		int plusMin = spendMin / 60;
		min += (spendMin % 60);
		if (min >= 60) {
			min -= 60;
			hour++;
		}

		hour += plusMin;

		if (hour >= 24) {
			hour -= 24;
		}

		System.out.println(hour + " " + min);

	}
}
