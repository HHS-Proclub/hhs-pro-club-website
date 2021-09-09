import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PRI3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			String num = in.nextLine();
			String[] durstr = in.nextLine().split(" ");
			ArrayList<Integer> durs = new ArrayList<Integer>();
			for(String s: durstr) {
				durs.add(Integer.parseInt(s));
			}
			durs.sort(new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					if(a<b)
						return 1;
					else if(a==b)
						return 0;
					else
						return -1;
				}
			});
			int res = 0;
			for(int i=0;i<durs.size();i++) {
				res+=i*durs.get(i)+1;
			}
			System.out.println(res);
		}
	}
}
