import java.util.Scanner;
	public class PRB2{
		public static void main(String args[])
		{
			Scanner kboard = new Scanner(System.in);
			int first = kboard.nextInt();
			int second = kboard.nextInt();
			int third = kboard.nextInt();
			int fourth = kboard.nextInt();
			int fifth = kboard.nextInt();
			int answer = first + second + third + fourth + fifth ;
			
			System.out.println( answer);
		}
	}
