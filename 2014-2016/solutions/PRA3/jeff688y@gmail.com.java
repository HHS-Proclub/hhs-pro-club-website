import java.util.Scanner;

public class PRA3 {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++){
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		
		int sumNext = 0;
		int j = 0;
		for (int i = 0; i < n; i++){
			if (sumNext < sum/2){
				sumNext += array[i];
			} else {
				if (sumNext == sum/2){
					j = i-2;
				} else {
					j = i-3;
				}

			}

		}
		System.out.println(j);

	}
}
