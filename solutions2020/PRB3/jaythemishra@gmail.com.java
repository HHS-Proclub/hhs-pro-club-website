import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int x = 0; x < a; x++) {
			int y = sc.nextInt();
			for(int z = 1; z <= y; z++) {
				if(y % z == 0)
					System.out.println(z);
			}
		}
	}

}