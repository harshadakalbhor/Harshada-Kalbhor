package bank;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Zeel","Pune",1234567,7500);
		s1.deposite(26000);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);
		
		s1.withdraw(3000);
		System.out.println(s1);
		
		
		
		

	}

}
