import java.util.Scanner;

public class PRB11 {
	
	
	
	
	
	public static void main(String[] args) {
	Scanner kboard = new Scanner(System.in);
	String input = kboard.nextLine();
	String[] words=input.split(" ");
	String hyp=words[0];
	String angle=words[1];
	
	double newangle = Integer.parseInt(angle);
	double newhyp = Integer.parseInt(hyp);
	
	double x= (newhyp*Math.cos(newangle * Math.PI/180));
	double y= (newhyp*Math.sin(newangle * Math.PI/180));
	
	int area = (int) (0.5*x*y);
	
	System.out.println(area);
	
	
	}
	
}
