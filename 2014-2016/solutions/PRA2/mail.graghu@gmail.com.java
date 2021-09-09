import java.util.ArrayList;


public class PRA2 {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		String f = scanner.nextLine();
		String s = scanner.nextLine();

		f.toLowerCase();
		s.toLowerCase();

		ArrayList<Character> first = new ArrayList<Character>(f.length());
		ArrayList<Character> second = new ArrayList<Character>(s.length());

		int c = 0;

		for (int x = 0; x < f.length(); x++) {
			first.add(f.charAt(x));	
		}
		for (int x = 0; x < s.length(); x++) {
			second.add(s.charAt(x));
		}

		for (int x = 0; x < first.size(); x++) {
			for(int y = 0; y < second.size(); y++) {
				if (first.get(x) == second.get(y)) {
					first.remove(x);
					x--;
					second.remove(y);
					y = second.size()+1;
				}
			}
		}// ENd of for loop
		if (first.size() == 0) {
			c+=second.size();
		}
		else if(second.size() == 0) {
			c+= first.size();
		}
		else {
			for (int x = 0; x < first.size(); x++) {
				if (first.size() > second.size()) {
					c++;
					first.remove(x);
					x--;
				}
				else if(first.size() == second.size()){
					c++;
					first.remove(x);
					second.remove(x);
					x--;
				}
				else {
					c++;
					second.remove(x);
					x--;
				}	
			}// End of for loop
		}// End of if statement
		System.out.println(c);
	} // End of main
}
