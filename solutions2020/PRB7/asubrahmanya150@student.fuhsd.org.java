import java.util.Scanner;

public class PRB7 {
	 public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int length = Integer.parseInt(in.nextLine());
		String temp = in.nextLine();
		String[] temparr = temp.split(" ");
		int[] numbers = new int[length];
		for(int i = 0; i < length; i++){
			numbers[i] = Integer.parseInt(temparr[i]);
		}
		int target = in.nextInt();
		double reps = 0;
		for(int i = 0; i < length; i++){
			if(numbers[i] == target){
				reps++;
			}
		}
		System.out.println((int)((reps*100)/((double)length)));
	}
}
