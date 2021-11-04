import java.util.Scanner;

public class PRI1 {
	
	static Scanner input = new Scanner(System.in);
	static int lines = input.nextInt();
	
	public static int AddNumbers() {
		int firstnum = input.nextInt();
		int secondnum = input.nextInt();
		return firstnum+secondnum;
		
	}
	
	public static void main (String[] args)
	{
		for (int x=0; x<lines; x++) {
			System.out.println(AddNumbers());
		}
	}
}