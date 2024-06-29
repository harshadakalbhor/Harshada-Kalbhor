package heart;

public class Heart {

	public static void main(String[] args) {
		int n=4;
		//outer loop
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//spacing
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//below part
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
