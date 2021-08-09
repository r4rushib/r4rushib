package starPattern;

import java.util.Arrays;
import java.util.Scanner;

public class Logical_Palindrom extends Palindrom_String {
	
	public static void main(String[] args) {
		 	Logical_Palindrom logic = new Logical_Palindrom();
//		logic.Multiplication_without_multplication_operator();	
		logic.String_Palindrom("nayan");
		Palindrom_String pa = new Palindrom_String(); System.out.println();
		pa.String_Palindrom("refer"); System.out.println();
		logic.ODD_EVEN_NUMBER();
		
		
	}
	
	void Array_Compare() {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]= {40,50,60};
		
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
		
		//use deepEquals for multi dimensional array.
		//Arrays.deepEquals(args, args);
	}
	void Factorial_of_Number () {
		int num=5;
		int fact=1;
		
		for(int i=num;i>=1;i--)//3,2,1,0
		{
			fact=fact*i;//3=1*3, 6=3*2, 6=6*1
		}
		
		System.out.println("factorial of number is "+fact);
	}
	
	public void String_Palindrom(String s) {
		String orignal=s;
		String reverse="";
		
		for (int i=orignal.length()-1;i>=0;i--)		//7,6,5,4,0,-1
			
		{
			reverse=reverse+orignal.charAt(i);		// rev=blank+y-->yticoleV
			
		}

		System.out.println("Orignal string is "+orignal);
		System.out.println("Reverse string is "+reverse);
		
		if (orignal.equals(reverse))
		{
			System.out.println("Given string is palindrom");
		}
		
		else {
			{
				System.out.println("Given string is not palindrom");
			}
	}

	}
	void Multiplication_without_multplication_operator() {
		//12*5=60;--> 12+12+12+12+12=60;
		
				int a=12;
				int b=5;
				
				int sum=0;
				
				for (int i=1;i<=b;i++)//i=1,2,5,
				{
					sum=sum+a;//12,24,60
				}
				
				System.out.println("multiplication is "+sum);
	}
	void ODD_EVEN_NUMBER() {

//		int a=11;
//		int b=3;
//		
//		System.out.println("/ of a/b is "+a/b);
//		
//		System.out.println("% of a%b is "+a%b);
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no to see even or odd");
	
		int num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Given number is even");
		}
		else 
		{
			System.out.println("Given number is odd");	
		}
	}
	
}
