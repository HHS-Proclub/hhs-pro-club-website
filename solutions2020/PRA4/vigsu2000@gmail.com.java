import java.util.Scanner;

public class PRA4 {
	
	public static int trainglePerim(int a, int b, int c) {
		int ab = a+b;
		int ac = a+c;
		int bc = b+c;
		while(true) {
			ab = a+b;
			ac = a+c;
			bc = b+c;
			if(ab>c) {
				if(ac>b) {
					if(bc>a) {
						return a+b+c;
					}
					else {
						a--;
					}
				}
				else {
					b--;
				}
			}
			else {
				c--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0; i < 3; i++) {
			if(i == 0)
				a = scan.nextInt();
			else if(i == 1)
				b = scan.nextInt();
			else
				c = scan.nextInt();
		}
		System.out.println(PRA4.trainglePerim(a, b, c));
	}

}
