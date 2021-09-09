import java.util.Scanner;

public class PRB3 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int numOfInts = s.nextInt() - 1;
		int largestInt = s.nextInt();
		for(int count = 0; count < numOfInts; count++) {
			int num = s.nextInt();
			
			if(num > largestInt)
				largestInt = num;
		}
		
		System.out.println(largestInt + "");	
	}
}
