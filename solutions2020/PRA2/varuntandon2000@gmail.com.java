import java.util.Scanner;

public class PRA2 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int stepSize = s.nextInt();
		int distance = s.nextInt();
		int numSteps = 0;
		while(distance > 0){
			if(numSteps%2 == 0)
				distance -= stepSize;
			else
				distance -= stepSize/2;
			numSteps++;
			
		}
		System.out.println(numSteps);
	}
}
