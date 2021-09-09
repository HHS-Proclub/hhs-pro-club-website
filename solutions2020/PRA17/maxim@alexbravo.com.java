import java.util.Scanner;

public class PRA17 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] result = new int[cases];
		for(int i = 0; i < cases; i++){
			result[i] = oddDivisor(sc.nextInt());
		}
		for(int i = 0; i < cases; i++){
			System.out.println(result[i]);
		}
		
	}
	
	public static int oddDivisor(int number){
		if(number == 0){
			return 0;
		}
		return getOdd(number) + oddDivisor(number-1);
	}
	public static int getOdd(int num){
		for(int i = num; i >= 1; i--){
			if(num%i == 0 && i%2 == 1){
				return i;
			}
		}
		return 0;
	}
}
