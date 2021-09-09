import java.util.Scanner;

public class PRB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		for(int i = 1; i < b+1; i++){
			System.out.println(i*a);
		}
	}

}
