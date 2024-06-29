package patterns;

public class Patterns {

	public static void main(String[] args) {
		int n = 5;
		 int m=7;
		
		//Rows
		
		System.out.println("Stars in Rows");
		
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
		

		//Columns
		System.out.println();
		System.out.println("Stars in Columns");
		
		for(int j=1;j<=m;j++) {
			System.out.print("*" + " ");
		}
		
		
		//Square
		
		int x=5;
		System.out.println();
		System.out.println("Square");
		  
		 for (int i = 1; i < x; i++) { 
		       for (int j = 1; j < x; j++) { 
		             System.out.print("*" + " ");
		       }
		 System.out.println(); 
		 }
		 
		 //Rectangle
		 System.out.println();
		 System.out.println("Rectangle");

		 for(int i=1;i<n;i++) {
			 for(int j=1;j<=m;j++) {
				 System.out.print("*" + "  ");
			 }
			 System.out.println();
		 }
		 
		 //Hollow Rectangle
		 System.out.println();
		 System.out.println("Hollow Rectangle");
		 //Outer loop
		 for(int i=1;i<=n;i++) {
			 //Inner loop
			 for(int j=1;j<=m;j++) {
				 if(i==1 || j==1 || i==n || j==m) {
					 System.out.print("*"); 
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
		 
		 //Triangle 1
		 System.out.println();
		 System.out.println("Triangle 1");
		 for(int i=1;i<n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
		 //Triangle 2
		 System.out.println();
		 System.out.println("Triangle 2");
		 for(int  i=1;i<n;i++) {
			 for(int j=i;j<n;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
		//Triangle 3
		 System.out.println();
		 System.out.println("Triangle 3");
		 //Inner  LOop
		 //1.for Spaces
		 //2.for Stars
		 

		 //Outer Loop
		 for(int i=1;i<n;i++) {
			 //inner Loop
			 //1.for Spaces
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
				//2.foe Stars 
				 for(int j=1;j<=i;j++) {
					 System.out.print("*");
				 }
			 System.out.println(" ");
			 
		 }

		 //Triangle 4
		 System.out.println();
		 System.out.println("Triangle 4");
		 for(int i=1;i<=n;i++){
			//for spacing
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			//for stars
			for(int j=1;j<=n-i;j++){
				System.out.print("*");
			}
			System.out.println();
		 }
		 
		//Rhombus
		 System.out.println();
		 System.out.println("Rhombus");
		 //outer loop
		 for(int i=1;i<=n;i++) {
			 //inner loop
			 //spacing
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
		 //stars
			 for(int j=1;j<=n;j++) {
				 System.out.print("*");
			 }
	 
		 System.out.println();
			}
	}
}




