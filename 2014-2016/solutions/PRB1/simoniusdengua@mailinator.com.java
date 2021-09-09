import java.util.Scanner;

public class PRB1 {
	//the part that does stuff
	public static void main(String[] Args){
		//the thing that scans the system
		Scanner scanner = new Scanner(System.in);

		int value_read = scanner.nextInt();
		int answer = 3 * value_read;

		System.out.println(answer);
	}
}
