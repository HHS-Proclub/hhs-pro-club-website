import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int candies;
		
		
		for(int i = 0; i < tests; i++) {
			int givingper = 1;
			candies = sc.nextInt();
			
			while(candies-givingper >= 0) {
				//System.out.println("number of candies = " + candies);
				candies -=givingper;
				givingper++;
				

			}
			System.out.println(givingper-1);
		}
		

	}

}
