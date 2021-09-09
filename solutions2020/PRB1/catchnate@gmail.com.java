/*
Author: Nathaniel Thomas
Date: 09/17/19
Rev: 01
*/
import java.util.Scanner; 
import java.util.LinkedList;
import java.util.Queue;

public class PRB1 {
	public static void main(String[ ] args) {
		int num, x, y, print;
		String tester;
		tester = "True";
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		Scanner myobj = new Scanner(System.in);
		System.out.println("How many problems do you have: ");
		num = myobj.nextInt();
		while (num > 0) {
			System.out.println("Enter the number of rows and the number of seats in each row: ");
			x = myobj.nextInt();
			y = myobj.nextInt();
			q.add(x);
			q.add(y);
			num -= 1;
		}
		while (tester == "True") {
			if (q.isEmpty()) {
				tester = "False";
			}
			else {
				x = q.remove();
				y = q.remove();
				q2.add(x * y);
			}
		}
		tester = "True";
		while (tester == "True") {
			if (q2.isEmpty()) {
				tester = "False";
			}
			else {
				print = q2.remove();
				System.out.println(print);
			}
		}		
	}	
}

		
				
		