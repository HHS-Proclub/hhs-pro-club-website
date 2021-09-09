import java.util.Scanner;

public class PRA5 {
	private static int n;
	private static int a;
	private static int b;
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("" + solve());
	}
	
	public static int solve(){
		// A counter for keeping track of the day
		int dayCount = 0;
		// A while loop to go through the algorithm n times
		while(dayCount < n){
			// maximum ascend for dayCount days
			int countDaysByAscend = a * (dayCount);
			// maximum decend for remaining days
			int remainingDaysByDecent = b*(n-dayCount);
			// The difference is to see the maximum net movement of the hiker
			int difference = countDaysByAscend - remainingDaysByDecent;
			// If the difference is less than 0 then that means that the hiker can still go down
			if (difference > 0) {
				// This result variable represents how far ago the hiker would 
				// have needed to stop to make it
		        int result = a - difference;
		        // if the difference was greater than one day worth of ascending(a)
		        // thien the result will be less than 0
		        if (result < 0) {
		        	// if the result is less than 0 than than we have to take away one 
		        	// day of ascending
		            return a*(dayCount-1);
		        } else {
		        	// if the result is greater than 0 that means that we just need to take of
		        	// the difference not a whole day
		            return a*dayCount - difference;
		        }
		    }
			// increment the day count each time
			dayCount++;
		}
		// if we could always come back then the highest we can go is a * (n -1) because
		// we need to save a day to come back.
		return a*(n-1);
	}
}
		 
