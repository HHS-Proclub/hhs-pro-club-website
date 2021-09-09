import java.util.Scanner;

public class PRB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int multiple = 1;
		int j = sc.nextInt();
		for(int x = 0; x < j; x++) {
			System.out.println(multiple * i);
			multiple++;
		}
	}

}
