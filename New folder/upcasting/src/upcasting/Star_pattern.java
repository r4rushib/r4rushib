package upcasting;

public class Star_pattern {

	public static void main(String[] args) {
		
		
		for (int a=0; a<=5;a++) {
			
			for (int b=a; b<=5;b++) {
				
				System.out.print(" ");
			}
			for (int c=0; c<=a;c++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	for (int a=0; a<=5;a++) {
			
			for (int b=0; b<=a;b++) {
				
				System.out.print(" ");
			}for (int c=a; c<=5;c++) {
				
				System.out.print("*");
			}
		
			
			
			System.out.println();
		}
		
	}

}
