package gettersettermethod;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//Scanner class to take the input from the user
		Scanner obj=new Scanner(System.in);
		
	    String Name;
	    System.out.println("Enter the Name:");
	    Name = obj.next(); //Object Creation
		int Income;
		System.out.println("Enter the Income:");
		Income=obj.nextInt();
		String Gender;
		System.out.println("Enter the Gender:");
		Gender=obj.next();
		int Age;
		System.out.println("Enter the Age:");
		Age=obj.nextInt();
		
		//Person object and initialize values using setter 
		PersonDetails person = new PersonDetails ();
		person.setName(Name);
		person.setAge(Age);
		person.setGender(Gender);
		person.setIncome(Income);
				
		//display person details using toString() method 
		System.out.println(person);

	    TaxCalculation calc=new TaxCalculation();
		calc .calculateTax(person); //tax calculation
		System.out.println("After calculation tax :");
				
		System.out.println(person);
				
		

	}

}
