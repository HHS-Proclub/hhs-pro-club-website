import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double goodFootDistance = sc.nextInt();
		double badFootDistance = goodFootDistance / 2.0;
		int stepsNeeded = 0;
		double totalDistance = sc.nextInt();
		while(totalDistance > 0) {
			totalDistance -= goodFootDistance;
			stepsNeeded++;
			if(totalDistance >= badFootDistance) {
				totalDistance -= badFootDistance;
				stepsNeeded++;
			}
		}
		System.out.println(stepsNeeded);

	}

}
