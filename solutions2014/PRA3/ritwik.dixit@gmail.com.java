import java.util.Scanner;

public class PRA3 {
	
	//I used the lazy way
	
	public static boolean checkWithSchwenksMathProof(int m, int n) {
		
			if (!(m <= n)) {
				return false;
			}
			
			if (m % 2 != 0 && n % 2 != 0) {
				return false;
			}
			
			if (m == 1 || m == 2 || m == 4) {
				return false;
			}
			
			if (m == 3) {
				if (n == 4 || n == 6 || n== 8) {
					return false;
				}
				
			}
			
			
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt(); 
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(checkWithSchwenksMathProof(m, n));
		


	}

}
