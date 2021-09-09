import java.util.Scanner;

public class PRB8 {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		double towerheight = ((kboard.nextDouble())/.5)/10;
		int time = (int) (Math.sqrt(towerheight)+.5);
		
		System.out.println(time);
		
		
		
		
		

	}

}
