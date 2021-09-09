import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int normal = sc.nextInt();
		int distance = sc.nextInt();
		double injured = normal/2.0;
		double curDistance = 0;
		int steps = 0;
		
		boolean there = false;
		
		while(true) {
			curDistance += normal;
			steps++;
			if(curDistance >= distance) {
				System.out.println(steps);
				break;
			}
			curDistance += injured;
			steps++;
			if(curDistance >= distance) {
				System.out.println(steps);
				break;
			}		
		}
	}
}
