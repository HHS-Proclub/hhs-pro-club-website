import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numvar = s.nextInt();
		String output = "";
		
		for (int i=0;i<numvar;i++) {
			int year = s.nextInt()+1;
			
			while(!isDistinct(Integer.toString(year))) {
				year++;
			}
			
			output += Integer.toString(year)+"\n";
		}
		
		System.out.println(output);
	}
	
	static boolean isDistinct(String year) {
		for (int i=0;i<10;i++) {
			if (year.length()-year.replace(Integer.toString(i), "").length() > 1) {
				return false;
			}
		}
		
		return true;
	}
}
