import java.util.Scanner;

public class PRB3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numSequences = input.nextInt();
		for(int i = 0; i < numSequences; i++) {
			int counter = 0;
			int numElements = input.nextInt();
			int[] nums = new int[numElements];
			for(int j = 0; j < numElements; j++) {
				nums[j] = input.nextInt();
			}
			for(int j = 0; j < numElements; j++) {
				boolean good = false;
				for(int k = 0; k < numElements; k++) {
					if(j != k && isRoot(nums[j] + nums[k])) {
						good = true;
						break;
					}
				}
				if(!good) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		
		input.close();
	}

	private static boolean isRoot(int x) {
		for(int n = 1; n <= x; n *= 2) {
			if(x == n)
				return true;
		}
		return false;
	}
	
}
