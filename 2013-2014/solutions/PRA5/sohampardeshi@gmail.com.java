import java.util.Scanner;


public class PRA5 {
	private static double m, n;
	private static int r;
	private static int count;
	
	public static void main(String[]Args){
		
		@SuppressWarnings("resource")
		Scanner inputReader = new Scanner(System.in);
			m = inputReader.nextDouble();
			n = inputReader.nextDouble();
			r = inputReader.nextInt();

			checkCircle(m,n,r);
		
		System.out.println(count);
		
	}
	
	public static void checkCircle(double m, double n, int r){
		for(int x = -r + (int)(m); x <= r + m + 1; x++){
			for(int y = -r + (int)(n); y <= r + n + 1; y++){
				double d = (x-m)*(x-m) + (y-n)*(y-n) - (r*r);
				if(d <= 0){					
					count++;
				}
			}
		}
	}
}
