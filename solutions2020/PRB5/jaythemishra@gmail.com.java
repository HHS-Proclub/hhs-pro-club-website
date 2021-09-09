import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class PRB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		first.trim();
		second.trim();

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int c = 0;
		int d = 0;
		int l = first.indexOf(' ');
		int j = second.indexOf(' ');

		a.add(Integer.parseInt(first.substring(0, l)));
		
		while(c < first.length() - 1) {
			int start = first.indexOf(' ', l + 1);
			int end = first.indexOf(' ', start + 1);
			a.add(Integer.parseInt(first.substring(start + 1, end)));
			c = end;

		}
		
		b.add(Integer.parseInt(second.substring(0, j)));
		
		while(d < first.length() - 1) {
			int start = first.indexOf(' ', j + 1);
			int end = first.indexOf(' ', start + 1);
			b.add(Integer.parseInt(second.substring(start + 1, end)));
			c = end;

		}
		
		/*do {
			a.add(sc.nextInt());
			
		} while(sc.hasNextLine() == true);*
		
		do {
			b.add(sc.nextInt());
			
		} while(sc.hasNextInt() == true);*/
		
		for(int x = 0; x < a.size(); x++) {
			int y = a.get(x);
			if (y % 10 != 0)
				a.set(x, 0);
		}
		
		for(int x = 0; x < b.size(); x++) {
			int y = b.get(x);
			if (y % 10 != 0)
				b.set(x, 0);
		}
		Collections.sort(a);
		Collections.sort(b);
		System.out.println(a.get(a.size() - 1) + b.get(b.size() - 1));


		//String a = sc.nextLine();
		//String b = sc.next
	}

}
