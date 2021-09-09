import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		for(int x = 0; x < 5; x++) {
			boolean canMakeLength = false;
			String s = sc.nextLine();
			String[] nums = s.split("\\s+");
			//int lengthmade 
			int total = Integer.parseInt(nums[2]);
			int num5In = Integer.parseInt(nums[1]);
			int num2In = Integer.parseInt(nums[0]);
			while(total > 5 && num5In > 0) {
				total -= 5;
				num5In--;
			}
			while(total > 0 && num2In > 0) {
				total -= 1;
				num2In--;
			}
			if(total == 0)
				System.out.println(true);
			else
				System.out.println(false);
		}
	}

}