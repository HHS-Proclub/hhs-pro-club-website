import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		//tell the system to get ready for user input
		Scanner userInput = new Scanner(System.in);
		//get the data from the next line
		int whatTheUserSaid = userInput.nextInt();
		int answer = whatTheUserSaid * 3;
		System.out.println(answer);

	}

}
