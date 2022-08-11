package section_5;

public class PrimeCount {

	public static void primeCount(int n) {
		
		if (n <= 0) {
			System.out.print("Invalid");
		}
		else {
			
			for (int i = 1; i <= n; i++) {
				
				int count = 0;
				for (int j = i; j >= 1; j--) {
					
					if (i % j == 0) {
						
						count += 1;
					}
				}
				if (count == 2) {
					System.out.println(i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		primeCount(50);
	}
}
