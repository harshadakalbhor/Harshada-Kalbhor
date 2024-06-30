package gettersettermethod;

public class PersonDetails {
	
	//Access Modifier
	//1.public
	//2.Private(makes the use of getter setter method)
	//3.Protected
	
	//Data Members
	private String Name;
	private int Income;
	private String Gender;
	private int Age;
	private int Tax;
	
	
	//Getter Setter  Method
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		this.Income = income;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		this.Tax = tax;
	}
	@Override
	public String toString() {
		return "PersonDetails [Name=" + Name + ", Income=" + Income + ", Gender=" + Gender + ", Age=" + Age + ", Tax="
				+ Tax + "]";
	}	

}
