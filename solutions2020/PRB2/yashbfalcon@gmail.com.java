import java.util.Scanner;
public class PRB2 {
	public static void main(String args[])
	{
		int one,two,three,four,five;
		Scanner kboard = new Scanner(System.in);
		one = kboard.nextInt();
		two = kboard.nextInt();
		three = kboard.nextInt();
		four = kboard.nextInt();
		five = kboard.nextInt();
		int answer = one+two+three+four+five;
		System.out.println(answer);
	}
}
