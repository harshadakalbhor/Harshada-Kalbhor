package strings;

public class Wrappers {

	public static void main(String[] args) {
		
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		int c=i;
		System.out.println(c);
		
		//autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		
	}

}
