import java.util.Scanner;
public class PRA4 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s16 = s+"0000";
		s = "0000"+s;
		int carryover = 0;
		String result = "";
		for(int x=s16.length()-1;x>=0;x--){
			int i = s.charAt(x)-'0';
			int j = s16.charAt(x)-'0';
			int sum = i+j+carryover;
			if(sum>=2){
				carryover = 1;
				sum-=2;
			}
			else{
				carryover = 0;
			}
			result = ""+sum+result;
		}
		if(carryover==1)
			result = 1+result;
		System.out.println(result);
	}
}
