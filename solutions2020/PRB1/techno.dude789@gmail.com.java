import java.util.Scanner;
public class PRB1 {

	public static void main(String[] args) {
		long n = 0;
		long N = 0;
		long M = 0;
		
		Scanner Scan = new Scanner(System.in);
		
		n = Scan.nextInt();	
		
		for (int i = 0; i < n; i += 1) {
			N = Scan.nextInt();
			M = Scan.nextInt();
			
			System.out.println(N * M);
		}
		
		Scan.close();
	}

}
