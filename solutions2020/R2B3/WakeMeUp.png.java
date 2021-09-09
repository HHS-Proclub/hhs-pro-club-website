import java.util.Scanner;
public class R2B3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeat = input.nextInt();
		int[] nums = new int[repeat];
		int[] answers = new int[repeat];
		for(int i = 0; i < repeat; i++){
			nums[i] = input.nextInt();
			answers[i] = 0;
			for(int y = 1; y < nums[i];y++){
				answers[i] += (y*y);
			}
		}
		for(int i = 0; i<repeat;i++){
			System.out.println(answers[i]);
		}
		input.close();

	}

}
