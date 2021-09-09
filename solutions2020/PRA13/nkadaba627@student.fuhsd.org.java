import java.util.Scanner;

public class PRA13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		sc.close();
		long w = Long.parseLong(s1);
		long h = Long.parseLong(s2);
		long m = Long.parseLong(s3);
		
		long a = 0;
		long b = 0;
		
		boolean good = true;
		while (good) {
			if (w * h <= m) {
				a = w*h;
				break;
			}
			w--;
		}
		
		boolean goof = true;
		while (goof) {
			if (w * h <= m) {
				b = w*h;
				break;
			}
			h--;
		}
		System.out.println(Long.max(a, b));
	}

}
