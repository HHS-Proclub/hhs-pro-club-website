import java.util.Scanner;


public class PRA5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numDiscs = Integer.parseInt(in.nextLine());
		System.out.println((int)((Math.pow(2, numDiscs))-1));
	}

}
