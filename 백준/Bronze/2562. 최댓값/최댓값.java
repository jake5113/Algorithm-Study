import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		int max = array[0];
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]> max) {
				max = array[i];
				num = i;
			}
		}
		
		System.out.println(max);
		System.out.print(num+1);
    }
}