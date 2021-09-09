import java.util.Scanner;

public class PROCO3 {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		for(int i = 0; i <len; i++){
			System.out.println(nthNumber(in.nextInt()));
		}
		
	}
	public static int nthNumber(int n){
		
		int value = 0;
		int power = 5; 
		while(n != 0){
			
			if( (n&1) != 0){
				value += power ; 
			}
			
			power *= 5; 
			n >>= 1; 
		}
		
		return value; 		
	}
}
