import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		String input = kboard.nextLine();
		int[] freqs = new int[120672];
		Arrays.fill(freqs, 0);
		for (char c: input.toCharArray()){
			freqs[c]++;
		}
		
		//Add character nodes to the priority queue:
		for (int i = 0; i < freqs.length; i++) {
		    if (freqs[i] > 0){
		    	System.out.println((char)i + " " + freqs[i]);
		    }
		}
	}
}
