import java.util.Scanner;

public class PRB8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner( System.in );
		double y = user_input.nextInt();
		int v = 0;
		int a = 10;
		
		//double t = (-v - Math.sqrt(-(4*-0.5*a*-y))) / 2 * -a; //v^2
		//System.out.print("Time: "+(int)t); //plus or minus
		
		
		System.out.print(Math.round(Math.sqrt(2 * y / a)));
	}

}
