import java.util.Scanner;
public class PRI1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int slob = sc.nextInt();
			int bob = sc.nextInt();
			var ctr = 0;
			while (bob >= slob) {
				slob *= 3;
				bob *= 2;
				ctr++;
			}
			System.out.println(ctr);
		}
		sc.close();
	}

}
