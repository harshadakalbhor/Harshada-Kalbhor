package Array;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		Student []  arr;
		//declare memory for 5 object of type student
		arr=new Student[5];
		
		arr[0]=new Student(1,"Harshada");
		arr[1]=new Student(2,"Bhagyashree");
		arr[2]=new Student(3,"Ayushi");
		arr[3]=new Student(4,"Saee");
		arr[4]=new Student(5,"Harsh");
//		arr[5]=new Student(6,"Pranjal");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements at"+ i+ ":"+ arr[i].getRollNo()+" "+ arr[i].getName());
			
		}
		
		

		


	}

}