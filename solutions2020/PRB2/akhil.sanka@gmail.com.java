import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = 0;
		for(int i = 0; i<5; i++){
			x += in.nextInt();
		}
		
		System.out.print(x);
	}

}
