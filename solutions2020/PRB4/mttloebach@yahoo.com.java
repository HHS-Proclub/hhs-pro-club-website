import java.util.Scanner;
public class PRB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int var1 = scan.nextInt();
		int var2 = scan.nextInt();
		for(int x = 1; x <= var2; x++){
			int answer = var1*x;
			System.out.println(answer);
			
		}

	}

}
