import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = 0;
		int n = num;
		do {
			num = (num % 10)*10 + (num / 10 + num % 10) % 10;
			
			count ++;
		}while (n != num);
			System.out.println(count);
		

	}
}