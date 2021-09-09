import java.util.ArrayList;
import java.util.Scanner;


public class PRB7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(s.nextLine());
		int count = 0;

		for(int x = 0;x < sb.length(); x++) {
			if(sb.charAt(x) == ',') {
				sb.deleteCharAt(x);
			}
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] str = sb.toString().split(" "); 

		boolean done = false;

		for(int x = 0; x < str.length - 1;x++) {
			if(str[x].equalsIgnoreCase(str[x+1])) {
				done = true;
			}
			else {
				if(done == true) {
					done = false;
					count++;
				}
			}
		}

		if(done == true) count++;
		System.out.println(count);
	}

}
