import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		String fraction = Kboard.nextLine();
		String[] numAndDen = fraction.split("/");
		int num = Integer.parseInt(numAndDen[0]);
		int den = Integer.parseInt(numAndDen[1]);
		for(int i = 1; i <= den; i++) {
			if(num % i == 0 && den % i == 0) {
				num = num/i;
				den = den/i;
				i = 1;
			}
		}
		System.out.println(num+ "/" +den);
	}
}
