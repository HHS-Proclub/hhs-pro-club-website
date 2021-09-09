import java.util.Scanner;
public class PRB4 {
	public static void main(String[] args) {
		Scanner myNumb = new Scanner(System.in);
		int n = myNumb.nextInt();
		for (int i=0;i<n;i++) {
			int x = myNumb.nextInt();
			if (x % 2 == 1) {
				System.out.println("ODD");
			} else {
				System.out.println("EVEN");
			}
		}
		myNumb.close();
	}

}
