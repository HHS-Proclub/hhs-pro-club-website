import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < Integer.parseInt(x); i++) {
            String n = in.nextLine();
           
            output.add(digits(n));
        }
        for (int o : output) {
            System.out.println(o);
        }
        in.close();
	}
	public static int digits(String num) {
		if (num.length() == 1) {
			return -1;
		}
		char[] numArray = num.toCharArray();
		int zeroCount = 0, fiveCount = 0;

		for (int in = 0; in < numArray.length; in++) {
			if (numArray[in] == '0') {
				zeroCount++;
			} else if (numArray[in] == '5') {
				fiveCount++;
			}
		}
		if (fiveCount > 0 && zeroCount == 0) {
			int j = numArray.length-1;
			boolean found = false;
			int swaps = 0;
			boolean flag = false;

			while (j >= 0) {
				if (numArray[j] == '5' && !found) {
					found = true;
					if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
						return swaps;
					}
					for (int k = j; k < numArray.length-1; k++) {
						char temp = numArray[k];
						numArray[k] = numArray[k+1];
						numArray[k+1] = temp;
						swaps++;
						
						if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
							flag = true;
							return swaps;
						}
					}
				}
				if (found && (numArray[j] == '7' || numArray[j] == '2')) {
					if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
						return swaps;
					}
					for (int k = j; k < numArray.length-1; k++) {
						char temp = numArray[k];
						numArray[k] = numArray[k+1];
						numArray[k+1] = temp;
						swaps++;
						
						if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
							flag = true;
							return swaps;
						}
					}
					
				}
				j--;
			}
			if (!flag) {
				swaps = 0;
			}
			if (swaps == 0) {
				return -1;
			}
		} else {
			int swaps = 0;
			int i = numArray.length-1;
			boolean flag = false;

			while (i >= 0) {
				if (numArray[i] == '0' || numArray[i] == '5') {
					if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
						return swaps;
					}
					for (int j = i; j < numArray.length-1; j++) {
						char temp = numArray[j];
						numArray[j] = numArray[j+1];
						numArray[j+1] = temp;
						swaps++;
						
						if (Integer.valueOf(numArray[numArray.length-2] + "" + numArray[numArray.length-1]) % 25 == 0) {
							flag = true;
							return swaps;
						}
					}
					
				}
				i--;
			}
			if (!flag) {
				swaps = 0;
			}
			if (swaps == 0) {
				return -1;
			}
		}
		
		return 0;
	}
}
