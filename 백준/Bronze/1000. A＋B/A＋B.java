import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a=0, b=0;
        
        while(true){
            a = sc.nextInt();
        if(a<=0) continue;
            if(b>=10) continue;
		b = sc.nextInt();
            break;
        }
	
		System.out.println(a + b);
	}
}