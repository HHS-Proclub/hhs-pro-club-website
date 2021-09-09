import java.util.Scanner;
public class PRB1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		//long[] people = new long	[times];
		for(int i = 0; i < times; i++) {
			long rows = sc.nextLong();
			long cols = sc.nextLong();
			System.out.println((rows*cols));
		}
		
		sc.close();
	}

}
