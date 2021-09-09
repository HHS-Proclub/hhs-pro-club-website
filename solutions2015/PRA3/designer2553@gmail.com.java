import java.util.Scanner;

public class PRA3 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int numbers = in.nextInt();
		int[] array = new int[numbers];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			int sumLeft = 0, sumRight = 0;
			
			for (int left = 0; left < i; left++) {
				sumLeft += array[left];
			}
			
			for (int right = i+1; right < array.length; right++) {
				sumRight += array[right];
			}
			
			if (sumLeft == sumRight) {
				index = i;
				break;
			}
		}
		
		System.out.println(index);
		in.close();
	}
}
