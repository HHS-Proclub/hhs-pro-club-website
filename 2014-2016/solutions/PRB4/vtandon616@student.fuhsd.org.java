import java.util.Scanner;

public class PRB4 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		long fish = 1;
		int e = a + b + c +d;
		do{
			 fish *= e;
			e--;
		}
	while(e > 0);
System.out.println(fish);
	}
}
