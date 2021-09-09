import java.util.Scanner;


public class PRB2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfDunks = input.nextInt(); 
		String scores = input.next();
		int total = 0;
		char[] score = scores.toCharArray();
		for(int i=0;i<numberOfDunks;i++){
			total+=Integer.parseInt(String.valueOf(score[i]));
		}
		System.out.println(total);
	}

}
