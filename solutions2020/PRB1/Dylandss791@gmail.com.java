import java.util.ArrayList;
import java.util.Scanner;

public class PRB1 {
	
	public int calculate(int i) {
		int people;
		int candies = i;
		for(people = 1; people <= candies;) {
			candies -= people;
			if(candies > people) {
				people++;
			}
		}
		return people;
	}
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		PRB1 cg = new PRB1();
		int numOfTests = kboard.nextInt();
		ArrayList<Integer> candies = new ArrayList<Integer>();
		for(int i = 0; i < numOfTests; i++) {
			int candy = kboard.nextInt();
			candies.add(candy);
		}
		for(int i = 0; i < candies.size(); i++) {
			System.out.println(cg.calculate(candies.get(i)));
		}
		
	}
}
