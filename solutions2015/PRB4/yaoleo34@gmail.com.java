import java.util.Scanner;


public class PRB4 {

	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int sum = 0;
		long out = 1;
		for (int i = 0; i <4; i++){
			sum+=kb.nextInt();
		}
			
		for (int i = sum; i>1; i--){
			out*=i;
		}

		System.out.println(out);
		
		
		
		
	}
	
	
	
	
	
}
