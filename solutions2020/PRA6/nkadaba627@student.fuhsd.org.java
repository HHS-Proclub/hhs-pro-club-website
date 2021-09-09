import java.util.Scanner;

public class PRA6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		String[] line = new String[100];
		for (int i = 0; i < b; i++) {
			line[i] = sc.nextLine();
		}
		sc.close();
		for (int k = 0; k < b; k++) {
			check(line[k]);
		}
	}

	public static void check(String line) {
		String pi = "pi";
		String ka = "ka";
		String chu = "chu";
		boolean works = false;
		int a = line.length();
		for (int i = 0; i <= a; i++) {
			if ((line.startsWith(pi) || line.startsWith(ka))) {
				line = line.substring(2);
				a-=2;
				works = true;
			} else if (line.startsWith(chu)) {
				line = line.substring(3);
				a-=3;
				works = true;
			} else {
				System.out.println("NO");
				break;
			}
			if (i >= line.length() && works == true) {
				System.out.println("YES");
			}
		}
	}
}
