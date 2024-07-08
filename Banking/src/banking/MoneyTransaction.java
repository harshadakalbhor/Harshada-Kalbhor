package banking;
import java.util.Scanner;

public class MoneyTransaction {
	
	//cash
	public static void Bank(double amt) {
		System.out.println("Enter the amt:" + amt + "Transaction performed .");
	}
	
	//cheque
	public static void Bank(String chequenumber, double amt) {
		System.out.println("Cheque transaction:" + amt + " Transaction performed with cheque number: " + chequenumber);
	}
	
	//Mobile Banking
	public static void Bank(String  accountNumber, double amt, int pinNumber) {
		System.out.println("Mobile Transaction:" + accountNumber + "Transaction performed with Amount: " + amt + "Pin number:" + pinNumber);
	}
	
	//Credit Or Debit card
	public static void Bank(String CardNumber, Double amount, String Password) {
		System.out.println("Card Transaction:" + CardNumber + "Transaction performed with Amount" + amount + "Password:" + Password);		
	}
	//Demand Draft
	public static void Bank(String DraftNumber, double  Amount, String bankName) {
		System.out.println("Demand Draft Transaction:" + DraftNumber + "Transaction performed with Bank" +bankName + "Amount:" + Amount);
	}
	
	
	//Main class

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		MoneyTransaction transaction=new MoneyTransaction();
		
		System.out.println("Select the type of Transaction:");
		System.out.println("1.Cash");
		System.out.println("2.Cheque");
		System.out.println("3.Mobile Banking");
		System.out.println("4.Credit Or Debit Card");
		System.out.println("5.Draft Demand");
		
		
		int choice=obj.nextInt();
		
		//Switch case
		switch(choice) {
		
		//cash
		case 1:System.out.println("Enter the amt:");
	    double Cashamt=obj.nextDouble();
	    transaction.Bank(Cashamt);
		break;
		
		//cheque
		case 2:System.out.println("Enter the cheque number:");
		String chequeNumber = obj.next();
        System.out.print("Enter amount: ");
        double chequeAmount = obj.nextDouble();
        transaction.Bank(chequeNumber, chequeAmount);
        break;
        
        
        //mobile banking
		case 3:System.out.println("Enter the Account Number:");
		String Accountnumber=obj.next();
		System.out.println("Entet the Amount:");
		double mobileAmount=obj.nextDouble();
		System.out.println("Enter Pin Number:");
		int PinNumber=obj.nextInt();
		transaction.Bank(Accountnumber, mobileAmount, PinNumber);
        break;
        
        
        //
		case 4:
            System.out.print("Enter Card Number: ");
            String CardNumber = obj.next();
            System.out.print("Enter the Amount: ");
            Double amount=obj.nextDouble();
            System.out.println("Enter the Password:");
            String Password=obj.next();
            transaction.Bank(CardNumber, amount, Password);
            break;
        
        //DD
		case 5:System.out.println("Enter the Account Number:");
		String accountNumber=obj.next();
		System.out.println("Enter the Amount:");
		double Amount=obj.nextDouble();
		transaction.Bank(accountNumber, Amount);
        break;
        
        
        default:System.out.println("Invalid Choice");
        obj.close();
		}
	}

}
