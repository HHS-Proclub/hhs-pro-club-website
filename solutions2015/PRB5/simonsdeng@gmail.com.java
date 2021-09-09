import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PRB5 {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Map<Character, Integer> frequencies = new TreeMap<>();
		for (char c : input.toCharArray()) {
			if (!frequencies.containsKey(c)) {
				frequencies.put(c, 1);
			} else {
				frequencies.put(c, frequencies.get(c) + 1);
			}
		}
		for (Entry<Character, Integer> e : frequencies.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
