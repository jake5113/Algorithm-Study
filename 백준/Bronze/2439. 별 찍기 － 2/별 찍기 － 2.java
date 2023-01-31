import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i < a+1; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
