import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println((new ArrayList<String>(Arrays.asList(in.nextLine().split(" ")))).stream().map(x -> Integer.parseInt(x) % 7).distinct().count());
		}
	}

}
