package Array;

import java.util.Arrays;

class ArrayOperations{
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
			System.out.println();
		}
	}
	
	//variable argument function
	public static int getSum(int... n) {//...we can provide size of an array  without defining it(...)
		int sum=0;
		for(int no : n)//for each loop
			sum+=no;
		return sum;
	}
	
	//count no. off odd elements
	public static int getOddCount(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]%2!=0)
				count++;
		}
		return count;
	}
	
	//count no. of even elements
	public static int getEvenCount(int b[]) {
		return b.length-getOddCount(b);
	}
}

public class Array {
	

	public static void main(String[] args) {
		
		int n=10;
		int a[];//declaration
		a=new int[n];//instantiation
		//Displaying the array
		ArrayOperations.printArray(a);
		
		//Assigning the values in array a
		for(int i=0;i<a.length;i++)
			a[i]=5*i;
		ArrayOperations.printArray(a);
		
		
		int b[]= {15,30,45,60,75};//initialization at the time of 
		ArrayOperations.printArray(b);
		
		///calling of variables argument function
		System.out.println("Sum of array elements is:" + ArrayOperations.getSum(b));
		
		b[2]=999;//assigning single elements
		
		//b[20]=67;  //Run time error thar Index 20 out of bounds for length 5
		ArrayOperations.printArray(b);
		
		///Display total number of Even and Odd numbers
		System.out.println("Odd number:"+ArrayOperations.getOddCount(b)+"\t Even nummber:"+ArrayOperations.getEvenCount(b));
		
		
		
		
		
		int intArr[]= {68,89,55,87,90};
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+" ");
		}
		System.out.println();

	
	//Sorting
	Arrays.sort(intArr);
	System.out.println(Arrays.toString(intArr));
	
	//binary search
	System.out.println(Arrays.binarySearch(intArr, 87));
	
	//index
	System.out.println(Arrays.binarySearch(intArr, 2, 4,89));
	
	//comparison
	System.out.println(Arrays.toString(intArr));
	//2nd array
	int intArr1[]= {10,20,30,40,50};
	System.out.println(Arrays.toString(intArr1));
	//compare
	if(Arrays.compare(intArr,intArr1)==0)
	
	{
		System.out.println("both the arrays are same");
	}
	else {
		System.out.println("both the arrays  are not same");
	}
	
	//copy array
	
	
	int intArr2[]=Arrays.copyOfRange(intArr, 1, 4);
	System.out.println(Arrays.toString(intArr2));
	
	
	
	int intArr3[]=Arrays.copyOf(intArr2, 0);
	//Fill method
	Arrays.fill(intArr3, 7);
	System.out.println(Arrays.toString(intArr3));
	
	}

}
