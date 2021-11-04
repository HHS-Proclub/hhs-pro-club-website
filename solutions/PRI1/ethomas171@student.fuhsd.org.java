import java.util.Scanner;
public class PRI1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_cases = sc.nextInt();
		int[] sums = new int[num_cases];
		for(int i=0;i<num_cases;i++) {
			int num_1 = sc.nextInt();
			int num_2 = sc.nextInt();
			int sum = num_1+num_2;
			sums[i] = sum;
		}
		for(int i=0;i<num_cases;i++) {
			System.out.println(sums[i]);
		}
	}

}
