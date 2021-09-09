import java.util.Scanner;

public class PRB2 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int lowerLimit = 0;
		int result = 0;
		int count = 0;
		
		if(s.nextInt() > 0)
			lowerLimit = s.nextInt();
		
		int upperLimit = s.nextInt();
		for(int i = lowerLimit+1; i < upperLimit; i++){
			result += i;
			count++;
		}
		
		System.out.println((double)result/count);
	}
}
