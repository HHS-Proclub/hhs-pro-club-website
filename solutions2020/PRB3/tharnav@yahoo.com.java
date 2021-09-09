import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int testcases = kboard.nextInt();
		long[] answers = new long[testcases];
		for(int i = 0; i < testcases; i++) {
			long someInt = kboard.nextLong();
			String number = String.valueOf(someInt);
			String[] digits2 = number.split("(?<=.)");
			int[] theNumber = new int[digits2.length];
			for(int j = 0; j < digits2.length; j++) {
				theNumber[j] = (Integer.parseInt(digits2[j]));
			}
			for(int j = theNumber.length-1; j >= 0; j--) {
				int bigCount = 69;
				for(int k = 0; k < theNumber.length; k++) {
					if(theNumber[k] > theNumber[j] && theNumber[k] < bigCount) {
						bigCount = theNumber[k];
					}
				}
				if(bigCount != 69) {
					int[] theThing = new int[theNumber.length];
					for(int ijj = 0; ijj < theNumber.length; ijj++) {
						theThing[ijj] = theNumber[ijj];
					}
					Arrays.sort(theThing);
					theNumber[j] = bigCount;
					for(int l = j+1; l < theNumber.length; l++) {
						theNumber[l] = theThing[0];
					}
					long theInt = 0;
					for(int l = 0; l < theNumber.length; l++) {
						theInt += (long)(Math.pow(10, theNumber.length-1-l)) * theNumber[l];
					}
					answers[i] = theInt;
					break;
				}
			}
			if(answers[i] == 0) {
				int[] stuff = new int[theNumber.length+1];
				for(int k = 0; k < theNumber.length; k++) {
					stuff[k] = theNumber[k];
				}
				stuff[stuff.length-1] = theNumber[0];
				long theInt = 0;
				for(int l = 0; l < stuff.length; l++) {
					theInt += (long)(Math.pow(10, stuff.length-1-l)) * stuff[l];
				}
				answers[i] = theInt;
			}
		}
		for(int i = 0; i < testcases; i++) {
			System.out.println(answers[i]);
		}
	}
}
