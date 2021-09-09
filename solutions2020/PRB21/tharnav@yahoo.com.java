package lol;

import java.util.Scanner;

public class PRB21 {

	private static int[] maxValue(int[] chars) {
	    int max = chars[0];
	    int index = 0;
	    for (int ktr = 0; ktr < chars.length; ktr++) {
	        if (chars[ktr] > max) {
	        	index = ktr;
	            max = chars[ktr];
	        }
	    }
	    int[] array = new int[2];
	    array[0] = max;
	    array[1] = index;
	    return array;
	}
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int[] array = new int[3];
		array[0] = kboard.nextInt();
		array[1] = kboard.nextInt();
		array[2] = kboard.nextInt();
		int d = kboard.nextInt();
		int answer = 0;
		for(int i = 0; i < d; i++) {
			int[] theArray = maxValue(array);
			answer+=theArray[0];
			array[theArray[1]]--;
		}
		System.out.println(answer);
	}
	
}
