import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, na, nb;
		a = scan.nextInt();
		b = scan.nextInt();

		nb = b - 45;

		if (nb < 0) {
			nb += 60;
			a--;
		}

		if (a < 0) {
			a += 24;
		}
		System.out.println(a + " " + nb);

	}
}
