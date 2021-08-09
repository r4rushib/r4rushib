package starPattern;

public class Palindrom_String {
	
	public static void main(String[] args) {
		Palindrom_String.Reverse_the_String("nayan");
		Palindrom_String p = new Palindrom_String();
		
		//p.Reverse_the_String("Rushikesh");
		p.String_Palindrom("rushikesh");
		
	}
	
	
	 static void Reverse_the_String(String revers) {
		
		String orignal=revers;
		String reverse="";
		
		for (int i=orignal.length()-1;i>=0;i--)			//7,6,5,4,0,-1
			
		{
			reverse=reverse+orignal.charAt(i);			// rev=blank+y-->yticoleV	
		}

		System.out.println("Orignal string is "+orignal);
		System.out.println("Reverse string is "+reverse);
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
}