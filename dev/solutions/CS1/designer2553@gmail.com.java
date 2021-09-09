import java.util.*;

public class CS1 {
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		int num1 = kboard.nextInt();
		int num2 = kboard.nextInt();
		String s1 = ""+num1;
		String s2 = ""+num2;
		ArrayList<Integer> digits1 = new ArrayList<Integer>(s1.length());
		ArrayList<Integer> digits2 = new ArrayList<Integer>(s2.length());
		
		for (int i = 0; i < s1.length(); i++) {
			digits1.add(Integer.parseInt(s1.substring(i, i+1)));
		}
		
		for (int i = 0; i < s2.length(); i++) {
			digits2.add(Integer.parseInt(s2.substring(i, i+1)));
		}
		
		ArrayList<Integer> digitSum = new ArrayList<Integer>(s1.length() >= s2.length() ? s1.length() : s2.length());
		
		for (int i = 0; i < (s1.length() >= s2.length() ? s1.length() : s2.length()); i++) {
			try {
				num1 = digits1.get(i);
			} catch (IndexOutOfBoundsException e) {
				num1 = 0;
			}
			
			try {
				num2 = digits2.get(i);
			} catch (IndexOutOfBoundsException e) {
				num2 = 0;
			}
			
			int sum = num1 + num2;
			
			if (sum > 10) {
				sum-= 10;
			}
			
			digitSum.add(sum);
		}
		
		String s = digitSum.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
		System.out.println(s);
	}
}
