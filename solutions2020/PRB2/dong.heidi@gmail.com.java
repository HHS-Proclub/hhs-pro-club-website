import java.util.ArrayList;
import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(5);
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a.add(in.nextInt());
		}
		System.out.println(a.stream().reduce(Integer::sum).get());
	}

}
