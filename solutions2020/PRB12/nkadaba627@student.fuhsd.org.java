import java.util.Scanner;

public class PRB12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int num = Integer.parseInt(s);
		String[] line = new String[num];
		for (int i = 0; i < num; i++)
			line[i] = sc.nextLine();
		sc.close();
		for (int i = 0; i < num; i++)
			System.out.println(line[i].substring(0, line[i].length() / 2));
	}
}
