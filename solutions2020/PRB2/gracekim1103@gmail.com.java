import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int whatTheUserSays1 = input.nextInt();
		int whatTheUserSays2 = input.nextInt();
		int whatTheUserSays3 = input.nextInt();
		int whatTheUserSays4 = input.nextInt();
		int whatTheUserSays5 = input.nextInt();
		int answer = whatTheUserSays1 + whatTheUserSays2 + whatTheUserSays3 + whatTheUserSays4 + whatTheUserSays5;
		System.out.println(answer);
	}

}
