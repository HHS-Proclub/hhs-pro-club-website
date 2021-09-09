import java.util.Scanner;
import java.lang.Math;
public class PRB1 {
	public static void main(String[] args){
		Scanner Steve = new Scanner(System.in);
		int Michael = Steve.nextInt();
		Michael = (int) (Math.sqrt(Michael)*2);
		System.out.println(Michael);		
	}
}