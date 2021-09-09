import java.util.Scanner;


public class HPIA {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int highest = -1;
		long lowest = 100000000000L;
		double sqrt = Math.sqrt(n);
		boolean checked = false;
		
		for (int i = 2; i <= n / 2 + 1; i++) {
			if (!checked && i >= sqrt && (highest == -1)) {
				checked = true;
				break;
			}
			
			if (n % i == 0) {
				if (i < lowest)
					lowest = i;
				if (i > highest)
					highest = i;
			}
		}
		
		if (highest == -1 || lowest == 100000000000L) {
			System.out.println("-1\n-1");
		} else {
			System.out.println(highest + "\n" + lowest);
		}
	}

}
