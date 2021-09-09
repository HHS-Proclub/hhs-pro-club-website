import java.util.Scanner;

public class PRB11 {
	
	public static void main(String[] args){
		

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = s.substring(0, s.indexOf(" "));
		String s2 = s.substring(s.indexOf(" ") + 1);
		
		int hyp = Integer.parseInt(s1);
		
		double angle = Integer.parseInt(s2) * Math.PI/180;;
		
		double leg1 = Math.sin(angle) * hyp;
		
		
		double area = Math.cos(angle) * hyp * Math.sin(angle) * hyp;
		area = area /2;
		
		System.out.println((int)area);
		
	}

}
