package starPattern;

public class Assending_Desc {

	public static void main(String[] args) {
		
		int a = 0;
		String star="*";
		
		for (int i = a; i<=5;i++) {
			
			for (int j=0 ;j<=i; j++) {
				
				System.out.print(star);
			}
			System.out.println();
		}
		
for (int i = a; i<=5;i++) {
			
			for (int j=i ;j<=5; j++) {
				
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
