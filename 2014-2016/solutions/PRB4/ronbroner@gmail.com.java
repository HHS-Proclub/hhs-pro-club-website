import java.util.Scanner;

public class PRB4 {
	static Scanner d = new Scanner(System.in);
	
	public static void main (String[] args){
		long sum = 0;
		long solution = 1;
		for (long k = 0;k<4;k++){
			sum = sum + d.nextInt();
		}
		for (long j = sum;j>0;j--){
			solution = solution*j;
		}
		if ((sum-0)<0.01){
			solution = 1;
		}
		System.out.println(solution);
	}
	
}
