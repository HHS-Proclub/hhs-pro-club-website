import java.util.Scanner;


public class PRB2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 1; i < max; i++) {
			sum += i;
			count++;
		}
		
		double avg = sum/(double)count;
		System.out.println(avg);
	}

}
