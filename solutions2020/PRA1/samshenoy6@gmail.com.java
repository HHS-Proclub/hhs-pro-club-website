import java.util.Scanner;
public class PRA1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int numYears = s.nextInt();
		String finalAns = new String();
		
		for (int i = 0; i < numYears; i++) {
			int year = s.nextInt() + 1;
			String str = Integer.toString(year);
			for (int j = 0; j < 8000; j++) {
				char n1 = str.charAt(0);
				char n2 = str.charAt(1);
				char n3 = str.charAt(2);
				char n4 = str.charAt(3);
				if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4) {
					str = Integer.toString(Integer.parseInt(str) + 1);
				}
				else {
					if (i == numYears -1)
						finalAns += str;
					else
						finalAns += str + "\n";
					break;
				}
					
			}
		}
		System.out.print(finalAns);
	}

}
