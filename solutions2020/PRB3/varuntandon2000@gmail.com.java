import java.util.Scanner;

public class PRB3 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int numTestCases = s.nextInt();
		for(int i = 0; i < numTestCases; i++){
			int init = s.nextInt();
			int divisor = 0;
			while(divisor <= init){
				divisor++;
				if(init%divisor == 0){
					System.out.println(divisor);
				}
			}
		}
	}
}
