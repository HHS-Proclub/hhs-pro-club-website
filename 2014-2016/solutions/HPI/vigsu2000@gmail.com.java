import java.util.NoSuchElementException;
import java.util.Scanner;

class HPI {

	public static int performCalculations(int n, String[] actions) {
		for(int i = 0; i < actions.length; i++) {
			if(getAction(actions[i]).equalsIgnoreCase("ADD")) {
				n += getValue(actions[i]);
			}
			if(getAction(actions[i]).equalsIgnoreCase("SUB")) {
				n -= getValue(actions[i]);
			}
			if(getAction(actions[i]).equalsIgnoreCase("MUL")) {
				n *= getValue(actions[i]);
			}
			if(getAction(actions[i]).equalsIgnoreCase("DIV")) {
				n /= getValue(actions[i]);
			}
			if(getAction(actions[i]).equalsIgnoreCase("COB")) {
				n = toDecimal(n, actions[i]);
			}
		}
		return n;
	}

	private static String getAction(String action) {
		return action.substring(0, 3);
	}

	private static int getValue(String action) {
		return Integer.parseInt(action.substring(4));
	}

	private static int toDecimal(int n, String action) {
		int base = getValue(action);
		String num = n + "";
		int sum = 0;
		for(int i = 0; i < num.length(); i++) {
			sum += Integer.parseInt(num.charAt(num.length()-1-i)+"") * Math.pow(base, i);
		}
		return sum;
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			String[] actions = new String[num];
			int n = Integer.parseInt(scanner.nextLine());
			for(int i = 0; i < num; i++) {
				actions[i] = scanner.nextLine();
			}
			System.out.println(performCalculations(n, actions));
		}catch(NoSuchElementException e) {
		}
	}

}
