import java.util.Scanner;

public class PRB1 {

	public static int multBy3(int i) {
		return i*3;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println(multBy3(i));
	}
}
