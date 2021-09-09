import java.util.*;

public class PRA17 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		
		int numIns = Integer.parseInt(s.nextLine());
		int[] solutions = new int[numIns];
		
		for (int i = 0; i < numIns; i++) {
			int year = Integer.parseInt(s.nextLine());
			c.setTime(new Date(year, 11, 10));
			int solution = c.get(Calendar.DAY_OF_WEEK);
			boolean done = false;
			while(!done) {
				year++;
				c.setTime(new Date(year, 11, 10));
				if (c.get(Calendar.DAY_OF_WEEK) == solution) {
					solutions[i] = year;
					done = true;
				}
			}
		}
		
		for (int i : solutions)
			System.out.println(i);
	}

}
