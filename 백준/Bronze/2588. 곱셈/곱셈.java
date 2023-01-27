import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String a, b;
		Scanner scan = new Scanner(System.in);
		a = scan.next();
		b = scan.next();
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		char a1 = a.charAt(0);
		char a2 = a.charAt(1);
		char a3 = a.charAt(2);
		
		char b1 = b.charAt(0);
		char b2 = b.charAt(1);
		char b3 = b.charAt(2);
		
		System.out.println(A*Character.getNumericValue(b3));
		System.out.println(A*Character.getNumericValue(b2));
		System.out.println(A*Character.getNumericValue(b1));
		System.out.println(A*B);

	}
}
