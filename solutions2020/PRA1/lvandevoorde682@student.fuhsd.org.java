import java.util.Scanner;

public class PRA1{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		String responses = "";
		for(int i = 0; i < num; i++) {
			int year = s.nextInt();
			
			int greaterYear = year+1;
			while (!unique(greaterYear)) {
				greaterYear += 1;
			}
			responses += greaterYear + "\n";
		}
		
		System.out.println(responses);
	}
	
	public static boolean unique(int year) {
		String yr = year + "";
		int[] nums = new int[yr.length()];
		
		for(int j = 0; j < yr.length(); j++) {
			nums[j] = Integer.parseInt(yr.charAt(j)+"");
		}
		
		for (int i = 0; i < yr.length() - 1; i++) {
			for (int j = i+1; j < yr.length(); j++) {
				if (nums[i] == nums[j])
					return false;
			}
		}
		return true;
	}
}
