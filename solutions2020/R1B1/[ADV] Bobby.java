//package R1;

import java.util.Scanner;

public class R1B1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] Sentence = in.nextLine().split(" ");
		for (int i = 0; i<(Sentence.length-1); i++){
			if (Sentence[i].equals(Sentence[i+1])){
				Sentence[i+1]="";
			}
		}
		for (int i = 0; i<(Sentence.length); i++){
			if (Sentence[i].equals("")){}
			else{
				System.out.print(Sentence[i]);
				System.out.print(" ");
			}
		}
	}
}
