import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();

		if (a > 0)
			if (b > 0)
				System.out.println("1");
			else
				System.out.println("4");
		else 
			if(b > 0)
				System.out.println("2");
			else
				System.out.println("3");
	}
}
