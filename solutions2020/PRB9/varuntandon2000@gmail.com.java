package examples;

import java.util.Arrays;
import java.util.Scanner;

public class PRB9 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int numInputs = s.nextInt();
		s.nextLine();
		String[] inputs = new String[numInputs];
		for(int i = 0; i < numInputs; i++){
			inputs[i] = s.nextLine();
		}
		
//		System.out.println(Arrays.toString(inputs));
		for(int i = 0; i < numInputs; i++){
			if(inputs[i].length() < 2){
				System.out.println();
				continue;
			}
			String changed = inputs[i].substring(2, inputs[i].length());
			if(inputs[i].charAt(1) == 'b')
				changed = 'b' + changed;
			if(inputs[i].charAt(0) == 'a')
				changed = 'a' + changed;
			System.out.println(changed);
			
		}
	}
}
