import java.util.Scanner;

public class PRA1 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int[] list = {s.nextInt(), s.nextInt(), s.nextInt()};
		int target;
		
		if (list[2] % 10 >= 5){
			target = list[2]/10 * 10 + 5;
		}
		else{
			target = list[2]/10;
		}
		
		if (target/5 <= list[1]){
			if (list[2] % 10 <= list[0]){
				System.out.println(true);
			}
			else{
				System.out.println(false);
			}
		}
		else{
			System.out.println(false);
		}
	}
}
