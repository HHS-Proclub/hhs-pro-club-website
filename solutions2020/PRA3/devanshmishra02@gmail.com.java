import java.util.ArrayList;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int length = scan.nextInt();
			ArrayList<Long> arr = new ArrayList<Long>(length);
			for(int j = 0; j < length; j++) {
				arr.add(scan.nextLong());
			}
			int a = check(arr);
			//long a = scan.nextLong();
			System.out.println(a);
		}
	}

	private static int check(ArrayList<Long> arr) {
		// TODO Auto-generated method stub
		boolean[] arr2 = new boolean[arr.size()];
		
		for(int i = 0; i < arr.size(); i++ ) {
			for(int j = 0; j < arr.size(); j++) {
				if(j != i) {
					long sum = arr.get(i) +arr.get(j);
					if(isPowerOfTwo(sum)) {
						arr2[i] = true;
						arr2[j] = true;
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < arr.size(); i++ ) {
			if(arr2[i] == false) {
				count++;
			}
		}
		return count;
	}
	private static boolean isPowerOfTwo(long number) {

	    if (number % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) return true;
	      }
	    }
	    return false;
	  }
}
