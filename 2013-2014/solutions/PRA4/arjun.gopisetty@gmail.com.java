import java.util.Scanner;


public class PRA4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		long num = Long.parseLong(input, 2);
		long newNum = num * 17;
		
		System.out.println(Long.toBinaryString(newNum));
		
		s.close();
	}
}
