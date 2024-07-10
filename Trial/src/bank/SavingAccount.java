package bank;

public class SavingAccount extends Customer implements Bank {
	private int accNo;
	private float balance;
	
	
	//constructor
	public SavingAccount(String name, String city, int accNo, float amount) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}

//getter setter method

	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public float getAmount() {
		return balance;
	}



	public void setAmount(float balance) {
		this.balance = balance;
	}


//	@override
	public void deposite(float amount) {
		if(amount <0 || amount>Deposit_Limit) {
			System.out.println("please deposite valid ammount");
		}
		else {
			balance+=amount;
			System.out.println("Rs:"+amount+"is deposited successfully");
		}
	}
	
//	@override
	public void withdraw(float amount) {
		if(amount<=balance-MINBAL) {
			balance-=amount;
			System.out.println("Rs:"+amount+"withdrawal is successful");
		}
		
		else {
			System.out.println("Insufficient balance");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getAccNo()=" + getAccNo()
				+ ", getAmount()=" + getAmount() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
}
