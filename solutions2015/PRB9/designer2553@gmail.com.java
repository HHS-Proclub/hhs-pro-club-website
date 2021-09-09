import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			int i = keyboard.nextInt();
			keyboard.nextLine();
			String nums = keyboard.nextLine();
			int target = keyboard.nextInt();
			String[] aNums = nums.split(" ");
			
			for (; i < aNums.length-1; i++) {
				int sum = 0;
				int n1 = Integer.parseInt(aNums[i]);
				int n2 = Integer.parseInt(aNums[i+1]);
				
				if (n1 == 6 || n2 == 6) {
					sum += n1;
					sum += n2;
					
					if (sum == target) {
						System.out.println(true);
						return;
					}
				}
				
			}
			
			System.out.println(false);
		} finally {
			keyboard.close();
		}
	}

}
