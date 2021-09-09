import java.util.Scanner;


public class PRB3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		int n = s.nextInt();
		int largest = s.nextInt();
		for (int x = 0; x < n - 1; x++) {
			int next = s.nextInt();
			if (next > largest) {
				largest = next;
			}
		}
		System.out.println(largest);
	}

}
