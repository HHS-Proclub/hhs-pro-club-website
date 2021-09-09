import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			String S = in.nextLine();
			int C = Integer.parseInt(in.nextLine());
			if(C>S.length()) {
				System.out.println("impossible");
				continue;
			}
			String alreadyUsed = "";
			for(int i=0;i<S.length();i++) {
				char curr = S.charAt(i);
				if(!alreadyUsed.contains(""+curr))
					alreadyUsed+=curr;
			}
			int leftover = Math.max(0, C-alreadyUsed.length());
			System.out.println(leftover);
//			if(leftover<1) {
//				System.out.println("0");
//				return;
//			} else {
//				int replacements=0;
//				alreadyUsed="";
//				for(int i=0;i<S.length();i++) {
//					char curr = S.charAt(i);
//					if(!alreadyUsed.contains(""+curr))
//						alreadyUsed+=curr;
//					else {//if the character is already used
//						char replacement='a';
//						while(alreadyUsed.contains(""+replacement))
//							replacement++;
//						alreadyUsed+=replacement;
//						S.replace(curr, replacement);
//						replacements++;
//						leftover--;
//					}
//				}
//				System.out.println(replacements);
//			}
		}
	}
}
