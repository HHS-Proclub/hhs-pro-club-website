import java.util.Scanner;

public class PRA1 {
	
	public static void main(String[] args) {
		String boo;
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int n = 0; n < num.length; n++){
			num[n] = scan.nextInt();
		}
			
		//trys to see if the 5in blocks can evenly divide where i is the number of blocks
			if(num[1]* 5 == num[2] || num[0]*1 == num[2]){
				boo = "true";
			}
			else if(num[1]*5 + num[0] >= num[2]){
				boo = "true";
			}
			else if(num[1]*5 < num[2] && num[2]-(num[1]*5)<=4 && num[0]>=4){
				boo = "true";
			}
			else if(num[1]*5 < num[2] && num[0]>=num[2]-num[1]*5){
				boo = "true";
			}
			else{
				boo = "false";
			}
		System.out.println(boo);
			
	}
}
