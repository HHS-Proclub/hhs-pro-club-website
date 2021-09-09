import java.util.Scanner;
public class PRB11 {

	public static void main(String[] args) {
		Scanner Ascan = new Scanner(System.in);
		String xy = Ascan.nextLine();
		String[] sides = xy.split(" ");
		
		int hypot = Integer.parseInt(sides[0]);
		int angle = Integer.parseInt(sides[1]);
		//System.out.println(Math.cos((angle*Math.PI)/180));
		//System.out.println(Math.sin((angle*Math.PI)/180));
		
		double X = hypot*(Math.cos((angle*Math.PI)/180));
		double Y = hypot*(Math.sin((angle*Math.PI)/180));
		double answer = X*Y*0.5;
		int ans = (int) Math.floor(answer);
		System.out.println(ans);
		
		// TODO Auto-generated method stub

	}

}
