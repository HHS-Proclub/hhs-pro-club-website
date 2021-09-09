import java.util.Arrays;
import java.util.Scanner;


public class PRB14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String input[] = new String[num];
		int nums[] = new int[3];

		for(int i=0;i<num;i++){
			input[i] = in.nextLine();
		}
		for(int i=0; i<num;i++){
			int index1 = input[i].indexOf(" ");
			int index2 = input[i].indexOf(" ", index1+1);
			nums[0] = Integer.parseInt(input[i].substring(0, index1));
			nums[1] = Integer.parseInt(input[i].substring(index1+1, index2));
			nums[2] = Integer.parseInt(input[i].substring(index2+1));
			
			Arrays.sort(nums);
			System.out.println(nums[1]);
			
		}
		
	}

}
