import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int a = 0; a < cases; a++) {
			long n = sc.nextInt();
			long k = sc.nextInt();
			
			long multiple = (long) ((int)(Math.pow(10, k)/n)*n);
			//System.out.println(multiple);
			long zeros = 0;
			long check = 0;
			while(zeros < k) {	
				check = multiple;
				while(check > 0) {
					if(check % 10 == 0) {
						zeros++;
					}else {
						break;
					}
					check /= 10;
				}
				if(zeros != k) {
					zeros = 0;
					multiple += n;
				}
			}
			System.out.println(multiple);
		}
	}
}
