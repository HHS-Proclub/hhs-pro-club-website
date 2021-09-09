import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PRA2 p = new PRA2();
		int healthy = in.nextInt();
		int distance = in.nextInt();
		
		System.out.println(p.mountainBike(healthy, distance));
	}
	public int mountainBike(int healthy, int distance) {
		int injury = healthy / 2;
		int numOfSteps = 2 * (distance / (healthy + injury));
		
		if (distance % (healthy + injury) != 0) {
			return numOfSteps+1;
		} else {
			return numOfSteps;
		}
	}
	

}
