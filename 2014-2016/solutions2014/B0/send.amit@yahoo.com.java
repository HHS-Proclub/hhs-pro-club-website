import java.util.Scanner;


public class B0 {

	public static void main(String[] args) {
		System.out.print(" ");
		Scanner input = new Scanner(System.in);
		int numPeeps = input.nextInt();
		String [] names = new String[numPeeps];
		for(int i = 0;i<3;i++)
			names[i] = input.next();
		
		for(String s : names)
			System.out.println(s);
			

	}

}
