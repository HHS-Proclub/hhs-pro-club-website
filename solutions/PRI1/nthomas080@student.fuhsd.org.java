import java.util.Scanner;

public class PRI1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] sums = new int[num];
		
		for (int i = 0; i < num; i ++) {
			
			sums[i] = sc.nextInt() + sc.nextInt();
			
		}
		
		for (int x : sums) {
			
			System.out.println(x);
			
		}
		
		sc.close();

	}

}
