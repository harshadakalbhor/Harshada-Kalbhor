package diamond;

public class Diamond {

	public static void main(String[] args) {
		int n=4;
		
		//Outer Loop
		for(int i=1;i<=n;i++) {
		//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
            //Opposite Side Triangle
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Downside
		//Outer Loop
		for(int i=1;i<=n;i++){
			//for spacing
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			//for stars
			for(int j=1;j<=n-i;j++){
				System.out.print("*");
			}
			
			//Opposite Side
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		 }
		 
		}
	}


