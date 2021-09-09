import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String s = in.nextLine();
			outputs.add(nextYear(Integer.parseInt(s)));
		}
		for (int o : outputs) {
			System.out.println(o);
		}
	}

	public static int nextYear(int year) {
		Set<Character> set = new HashSet<>();
		int start = year+1;
		
		while (true) {
			String s = String.valueOf(start);
			set.add(s.charAt(0));
			set.add(s.charAt(1));
			set.add(s.charAt(2));
			set.add(s.charAt(3));
			
			if (set.size() != 4) {
				start++;
				set.clear();
			} else {
				return start;
			}
		}
	}
}