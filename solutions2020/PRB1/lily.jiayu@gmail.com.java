import java.util.Scanner;

public class PRB1 {

	public static int prb1(int n) {
		int i = 0;
		while(i < n) {
			int product = 0;
			for(int j = i; j > 0; j --) {
				product += j;
			}
//			System.out.println("product: " + product);
			if(product == n) {
//				System.out.println("return: " + i);
				return i;
			}
			if(product > n) {
//				System.out.println("returning: " + i--);
				return i--;
			}
			i++;
		}
//		System.out.println("hello: " + i);
		
		return i;
	}

	public static void main(String args[]) {
//		System.out.print(prb1(3));

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i = 0; i < x; i ++) {
			int y = scan.nextInt();
			System.out.println(prb1(y));
		}
	}

}
