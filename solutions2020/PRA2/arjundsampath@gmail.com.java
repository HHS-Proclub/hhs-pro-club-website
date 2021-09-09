import java.util.Scanner;
import java.lang.Math;
public class PRA2 {
	 public static void main(String[] args) {
		 Scanner i = new Scanner(System.in);
		 int good = i.nextInt();
		 int total = i.nextInt();
		 int bad = good/2;
		 int steps = 0;
		 int traveled = 0;
		 boolean foot = true;
		 while(traveled<total){
			 if(foot == true){
				 traveled = traveled + good;
				 steps++;
				 foot = false;
			 }
			 else if(foot == false){
				 traveled = traveled + bad;
				 steps++;
				 foot = true;
			 }
		 }
		 System.out.println(steps);
	 }
}
