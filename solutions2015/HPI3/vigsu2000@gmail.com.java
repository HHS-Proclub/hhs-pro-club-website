import java.util.ArrayList;
import java.util.Scanner;

public class HPI3 {

	public static String compressedString(String s) {
		int i = 0;
		int counter;
		int count;
		String output = "";
		while(i < s.length()-1) {
			count = 1;
			counter = i+1;
			try {
			while(s.charAt(counter) == s.charAt(i)) {
				counter++;
				count++;
				i++;
			}}catch(StringIndexOutOfBoundsException e) {
				output += s.charAt(i);
				output += count + "";
				return output;
			}
			String c = s.charAt(i) + "";
			String n = count + "";
			output += c+n;
			i++;	

		}
		output += s.charAt(s.length()-1);
		output += "1";
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(compressedString(str));
	}

}
