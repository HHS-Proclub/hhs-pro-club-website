import java.util.Scanner;
public class PRB1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double in = input.nextInt();
		double out =Math.pow(in, 1/2.0);
		System.out.println((int)(out*2));
	}

}
