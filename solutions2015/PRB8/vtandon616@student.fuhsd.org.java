import java.util.Scanner;

public class PRB8 {
	public static int LCM(int x, int y){
		int count = 1;
		int gcd = 1;
		while(count <= x && count <= y)
		{
			if(x%count == 0 && y%count == 0){
				gcd = count;
			}
			count++;
		}
		return(x*y/gcd);

	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputs = input.split(" ");
		int x,y = 0;
		x = Integer.parseInt(inputs[0]);
		y = Integer.parseInt(inputs[1]);
		System.out.println(LCM(x,y));
	}
}
