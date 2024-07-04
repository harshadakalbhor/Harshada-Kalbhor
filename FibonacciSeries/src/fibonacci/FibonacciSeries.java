package fibonacci;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=obj.nextInt();
		
		//Initilization
		int  a=0;
		int b=1;
		System.out.println(a);
		
		if(n>1) {
			for(int i=2;i<=n;i++) {
				System.out.println(b);
			//Swapping
			int temp=b;
			b=a+b;
			a=temp;
			
		}
		System.out.println();
		}

	}

}
