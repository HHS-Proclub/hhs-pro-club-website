import java.util.Scanner;

public class PRA2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numNums = Integer.parseInt(scan.nextLine());
		
		String out = "";
		
		for(int i = 0; i < numNums; i++) {
			int num = Integer.parseInt(scan.next());
			if (emirp(num))
				out += "YES\n";
			else
				out += "NO\n";
		}
		
		System.out.println(out);
	}
	
	public static boolean emirp(int n) {
		String s = "" + n;
		StringBuilder sb = new StringBuilder(s);
		int reversed = Integer.parseInt(sb.reverse().toString());
		
		return (n!= reversed) && isPrime(n) && isPrime(reversed);
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
