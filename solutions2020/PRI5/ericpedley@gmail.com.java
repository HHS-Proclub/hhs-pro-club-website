import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PRI5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			String[] lengths = in.nextLine().split(" ");
			String S = in.nextLine();
			String T = in.nextLine();
			int starIndex = -1;
			boolean cont=false;
			for(int i=0;i<S.length();i++) {
				char curr = S.charAt(i);
				if(curr=='*') {
					starIndex=i;
					break;
				}
				if(i>=T.length()||curr!=T.charAt(i)) {//if there's a matching character before the star
					System.out.println("NO");
					cont=true;
					break;
				}
				
			}//a is 97, z is 122
			if(cont)
				continue;
			else {
				if(starIndex==-1) {
					System.out.println("YES");
					continue;
				}
				boolean no=false;
				for(int i=1;i<S.length()-starIndex;i++) {
					if(i>=T.length()-starIndex||T.charAt(T.length()-i)!=S.charAt(S.length()-i)) {
						System.out.println("NO");
						no=true;
						break;
					}
				}
				if(!no)
					System.out.println("YES");
			}
		}
	}
}
