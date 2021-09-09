/*
 Author: Nathaniel Thomas
 Date: 9/27/19
 Rev: 01
 */
import java.util.*;



public class PRA1 {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		String magicNum;
		LinkedList<String> q = new LinkedList<>();
		LinkedList<String> q2 = new LinkedList<>();
		magicNum = "nothing";
		String answer;
		answer = "Yes";
		boolean test, test2;
		test = true;
		test2 = true;
		
		int probs = myobj.nextInt();
		
		while (probs > 0) {
			magicNum = myobj.next();
			probs -= 1;
			q.add(magicNum);
		}
		
		while (test) {
			if (q.isEmpty()) {
				test = false;
				continue;
			}
			else {
				magicNum = q.remove();
				if (magicNum.contains("144")) {
					magicNum = magicNum.replace("144", "");
				}
				}	
				if (magicNum.contains("14")) {
					magicNum = magicNum.replace("14", "");
				}
				if (magicNum.contains("1")) {
					magicNum = magicNum.replace("1", "");
				}
				if (magicNum.isEmpty()) {
					q2.add("YES");
				}
				else {
					q2.add("NO");
				}
			}
		
		while (test2) {
			if (q2.isEmpty()) {
				test2 = false;
			}
			else {
				answer = q2.remove();
				System.out.println(answer);
			}
		}
		myobj.close();

	}

}
