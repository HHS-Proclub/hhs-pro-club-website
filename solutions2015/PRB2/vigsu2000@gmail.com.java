import java.util.Scanner;

public class PRB2 {

	public static double aveOfPosNums(int smaller, int larger) {
		if(larger <= 0) {
			return 0;
		}
		double sum = 0;
		for(int i = 1; i < larger; i++) {
			sum += i;
		}
		return sum/(larger-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int smaller = s.nextInt();
		Scanner scan = new Scanner(System.in);
		int larger = s.nextInt();
		System.out.println(aveOfPosNums(smaller, larger));
	}

}
