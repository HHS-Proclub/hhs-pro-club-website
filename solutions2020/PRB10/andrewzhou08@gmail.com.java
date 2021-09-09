import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		
		String[] nums = in.split("/");
		
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		
		
		
		String out = asFraction(num1, num2);
		
		
		System.out.println(out);
	}

	public static long gcm(int a, int b) {
	    return b == 0 ? a : gcm(b, a % b);
	}
	
	public static String asFraction(int a, int b) {
	    long gcm = gcm(a, b);
	    return (a / gcm) + "/" + (b / gcm);
	}
}
