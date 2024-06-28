package numbers;

public class Numbers {

	public static void main(String[] args) {
		int x=7;
		
		int a=30;
		int b=10;
		
		int z=4;
		
		
		//To Find Even and Odd Numbers
		if(x%2==0) {
			System.out.println("Number is Even");
		}
		
		else {
			System.out.println("Number is odd");
		}
		
		
		//To  Find the Greater number
		
		if(a==b) {
			System.out.println("Equal");
		}
		else {
			if(a>b) {
				System.out.println("Greater");
			}
			else {
				System.out.println("Smaller");
			}
		}
		
		
		
		//Switch case
		
		switch(z) {
		
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thursday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default: System.out.println("Invalid Number");
		
		break;
		}

	}

}
