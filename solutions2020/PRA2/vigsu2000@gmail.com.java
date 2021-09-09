import java.util.Scanner;

//biking
public class PRA2 {
	public static int getSteps(int stepLength, int distToHospital) {
		double halfStep = stepLength/2;
		int stepCount = 0;
		int distanceTravelled = 0;
		while(distanceTravelled < distToHospital) {
			if(stepCount%2==0) {
				distanceTravelled+=stepLength;
			}
			else {
				distanceTravelled+=halfStep;
			}
			stepCount++;
		}
		return stepCount;
	}
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int stepLength = 0;
		int distance = 0;
		for(int i = 0; i< 2; i++) {
			if(i == 0) {
				stepLength = s.nextInt();
			}
			else {
				distance = s.nextInt();
			}
		}
		System.out.println(getSteps(stepLength, distance));
	}
}
