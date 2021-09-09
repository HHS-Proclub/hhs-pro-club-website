import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = Integer.parseInt(in.nextLine());
		int d = Integer.parseInt(in.nextLine());
		int steps = 0;
		boolean goodFoot = true;
		while (d > 0) {
			d -= goodFoot ? s : s / 2;
			goodFoot = !goodFoot;
			steps++;
		}
		System.out.println(steps);
	}

}
