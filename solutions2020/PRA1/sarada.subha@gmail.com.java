import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA1 {
	private Set<String> nums;
	
	public PRA1() {
		nums = new HashSet<>();
		nums.add("1");
		nums.add("14");
		nums.add("144");
	}
	public static void main(String[] args) {
		PRA1 p = new PRA1();
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		List<String> output = new ArrayList<>();
		
		for (int i = 0; i < Integer.valueOf(num); i++) {
			String str = in.nextLine();
			output.add(p.isMagicNumber(str));
		}
		for (String i : output) {
			System.out.println(i);
		}
		in.close();
	}
	public String isMagicNumber(String num) {
		if (num.equals("")) {
			return "YES";
		}
		String tempStr = "";
		int i = 0;
		int j = 0;
		boolean flag = false;
		
		while (i < num.length() && j < num.length()) {
			tempStr = num.substring(i, j+1);
			
			if (nums.contains(tempStr)) {
				flag = true;
				j++;
			} else {
				if (i != j) {
					i = j;
				} else {
					flag = false;
				}
			}
			if (!flag) {
				break;
			}
		}
		if (flag) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
