import java.util.Scanner;

public class PRB10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] stuff = input.split("/");
		int[] nums = new int[2];
		for (int i = 0; i < 2; i++) {
			nums[i] = Integer.parseInt(stuff[i]);
		}
		System.out.println(work(nums[0], nums[1]));

	}
	public static String work(int a, int b){
		int n = Math.min(a, b);
		int m = Math.max(a, b);
		for(int i = m;i>1;i--){
			if(a%i==0&&b%i==0){
				return a/i+"/"+b/i;
			}
		}
		return a+"/"+b;
		
	}

}
