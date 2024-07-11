package strings;

public class Strings {

	public static void main(String[] args) {
		String s1="TNSIF";
		String s2="TNSIF";
		
		String s4=new String("TNSIF");
		
		System.out.println(s1);
		String s3=s1.toLowerCase();
		System.out.println(s3);
		System.out.println(s1.length());
		
		String fullname=s1 + s2;
		System.out.println(fullname);
		
		
		
		
		
		
		//String Buffer
		
		StringBuffer  buffer=new StringBuffer("Hello");
		System.out.println("Buffer:"+buffer);
		System.out.println("Length:"+buffer.length());
		System.out.println("capacity:"+buffer.capacity());
		
		//append
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a:").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer("I Java!");
		buffer.insert(2," like ");
		
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		
		
		
		
		
		

	}

}
