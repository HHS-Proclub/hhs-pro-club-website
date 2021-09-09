/*
Author: Nathaniel Thomas
Date: 09/18/19
Rev: 02
*/

import java. util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class PRI1 {
	public static void main(String[ ] args) {
		Scanner myobj = new Scanner(System.in);
		Scanner kboard = new Scanner(System.in);
		String tester = "True";
		String test = "True";
		String nice = "True";
		int b = 0;
		int x, y, z, probs;
		probs = 0;
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		probs = myobj.nextInt();
		while (probs > 0) {
			x = kboard.nextInt();
			y = kboard.nextInt();
			z = kboard.nextInt();
			q.add(x);
			q.add(y);
			q.add(z);
			probs -= 1;
		}
		while (tester == "True") {
			if (q.isEmpty()) {
				tester = "False";
			}
			else {
				x = q.remove();
				y = q.remove();
				z = q.remove();
				b = 0;
				test = "True";
				while (test == "True")	{
					if (x < (y + z + b)) {
						y -= 1;
						z -= 1;
						b ++;
					}
					else if (x == (y + z + b)) {
						if (y > z) {
							y += 1;
						}
						if (z > y) {
							y = z;
							y +=1;
						}
						if (z == y) {
							y++;
						}
						test = "False";
						q2.add(y);
					}
				}
			}
		}
		
		while (nice == "True") {
			if (q2.isEmpty()) {
				nice = "False";
			}
			else {
				int answer = q2.remove();
				System.out.println(answer);
			}
		}
		myobj.close();
		kboard.close();
	}
}

		