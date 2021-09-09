import java.util.Scanner;
public class PRA1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++){
			int num1 = in.nextInt();
			int num5 = in.nextInt();
			int numTot = in.nextInt();
			num5 += num1 /5;
			
			if (numTot % 5 < num1) System.out.println("false");
			else if (num5 >= numTot / 5) System.out.println("true");
			else System.out.println("false");
			
		}
	}
}
