package starPattern;

public class Pyramid {

	public static void main(String[] args) {

		
		String star = "*";
		int a = 5;
		for (int i = 0 ; i <= a ; i++) {
			
			for (int j = 0 ; j<=a ; j++) {
				
			if (i==j || i+j==2) {
				System.out.print(star);
				
			}
			}
			System.out.println();
		}
		
//for (int i = 0 ; i <= 5 ; i++) {
//			
//			for (int j = i ; j<=5 ; j++) {
//				
//				System.out.print(star);
//			}
//			System.out.println();
//		}
	}

}
