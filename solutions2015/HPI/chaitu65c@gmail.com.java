import java.util.*;

public class HPI {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner g = new Scanner(System.in);
		String t = g.nextLine();
		int trials = Integer.parseInt(t);
		String s = g.nextLine();
		long start = Integer.parseInt(s);
		String end = "";
		for (int i = 0; i < trials; i++) {
			String com = g.nextLine();
			String[] a = com.split("\\s");
			int num = Integer.parseInt(a[1]);
			if (a[0].equals("ADD"))
				start += num;
			else if (a[0].equals("SUB"))
				start -= num;
			else if (a[0].equals("MUL"))
				start *= num;
			else if (a[0].equals("DIV") && num > 0)
				start /= num;
			else if (a[0].equals("COB")) {
				if (num > 2 && num < 10) {
					start = Long.parseLong(Long.toString(Long.parseLong("" + start, num), 10));
				}
				else if(num == 10){
					start = 1;
				}
			}
		}
		end += start;
		System.out.println(end);
	}
}
