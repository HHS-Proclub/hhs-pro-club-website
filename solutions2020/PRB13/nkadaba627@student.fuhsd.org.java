import java.util.Scanner;

public class PRB13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		String[] s = line.split(" ");
		int[] nums = new int[4];
		for(int i = 0;i<4;i++){
			nums[i] = Integer.parseInt(s[i]);
		}
		int k1 = nums[0];
		int k2 = nums[1];
		int k4 = nums[3];
		int biggestSum = 0;
		boolean good = true;
		for(int i = 0;k1>0 && k2>0 && k4>0;k1--,k2--,k4--)
			biggestSum +=142;
		for(int i = 0;k1>0 && k2>0;k1--,k2--){
			biggestSum +=12;
		}
		System.out.println(biggestSum);
	}

}
