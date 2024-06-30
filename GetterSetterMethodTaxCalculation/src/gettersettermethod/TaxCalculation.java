package gettersettermethod;

public class TaxCalculation {
	
	//Function to Calculate Tax
	public void calculateTax(PersonDetails person) {  //Syntax of Function; void no  return type;PersonDetails name of the previous class; person Parameter of the function;calculateTax name of the function in camel case
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female")){  //equalsIgnoreCase means the use can give input in any form like Female,FEMALE,FeMale,etc so it should be accepted in any type
			person.setTax(0); //default Constructor
			System.out.println("Tax not Applicable");
		}
		else {
			if(person.getIncome()<=160000) { //Get means taking input from user while set means showing output to the user
				person.setTax(0);
			}
			else if (person.getIncome() >160000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome() - 160000) * 10/100);  //10% of tax will be applied 
			} 
			else if (person.getIncome() >500000 && person.getIncome() <= 800000) {
				person.setTax((person.getIncome() - 500000) * 20/100 + 34000); //20% tax
			} 
			else {
				person.setTax((person.getIncome() - 800000) * 30/100 + 94000);	//30% tax		
			}
				
			
		}
	}

}
