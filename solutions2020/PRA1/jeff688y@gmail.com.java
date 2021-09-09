import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int a = kboard.nextInt();
		int b = kboard.nextInt();
		int total = kboard.nextInt();
		int r = total%5;
		int r1 = a%5;
		if (a >= total){
			System.out.println("true");
			return;
		}
		if (a >= 5 && (a-r)/5 + b >= total/5){
			System.out.println("true");
			return;
		} else if (r1 >= r && (a-r)/5 + b >= total/5){
			System.out.println("true");
			return;
		}
		System.out.println("false");
	
	}

}
