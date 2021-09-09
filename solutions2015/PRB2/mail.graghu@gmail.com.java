import java.util.Scanner;
import java.lang.Math;


public class PRB2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int lower = scanner.nextInt();
		int higher = scanner.nextInt();
		
		if(lower < 0) {
			System.out.println(findAverage(0, higher));
		}
		else {
			System.out.println(findAverage(lower, higher));
		}
	}

	public static double findAverage(int first, int second) {
		double sum = 0;
		int count;
		for (int x = first; x < second; x++) {
			sum += x;
		}
		if (first != 0){
			count = second - first;
		}
		else {
			count = second - first - 1;
		}
		double average = sum/count;
		
		return Math.abs(average);
	}

}
