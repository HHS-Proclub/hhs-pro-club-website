import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean validTriangle = false;
		while(validTriangle == false) {
			if(a < b + c) {
				if(b < a + c) {
					if(c < a + b)
						validTriangle = true;
					else
						c--;
				}
				else
					b--;
			}
			else
				a--;
		}
		System.out.println(a + b + c);
	}

}
