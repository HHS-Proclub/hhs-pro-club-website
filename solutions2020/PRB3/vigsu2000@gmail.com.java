import java.util.ArrayList;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> answers = new ArrayList<Integer>();
		for(int i = 0; i < a; i++) {
			int n = Integer.parseInt(scan.nextLine());
			for(int x = 1; x <= n; x++) {
				if(n%x==0) {
					answers.add(x);
				}
			}
		}
		for(int b = 0; b < answers.size(); b++) {
			System.out.println(answers.get(b).intValue());
		}
	}
}
