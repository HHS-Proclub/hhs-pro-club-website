import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<String> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			
			outputs.add(ticket(s2));
		}
		for (String o : outputs) {
			System.out.println(o);
		}
		in.close();
	}
	public static String ticket(String s) {
		int[] arr = new int[s.length()];
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = Integer.valueOf(s.charAt(i) + "");
			sum += arr[i];
		}
		for (int i = 2; i <= Math.sqrt(sum); i++) {
			if (sum % i == 0) {
				int res = sum / i;
				int j = 0;
				int total = 0;
				
				while (true) {
					total += arr[j];
					if (total < res) {
						j++;
					} else if (total == res) {
						total = 0;
						j++;
					} else {
						break;
					}
					if (j == arr.length) {
						return "YES";
					}
				}
			}
		}
		return "NO";
	}
}
