import java.util.Scanner;

public class R2B1 
{
	public static void main(String args[])
	{
		System.out.print("Amount of Money\n");
		Scanner kboard = new Scanner(System.in);
		int money = kboard.nextInt();
		
		System.out.print("Amount of items\n");
		Scanner amountinput = new Scanner(System.in);
		int items = amountinput.nextInt();
		
		System.out.print("Price of each item\n");
		System.out.print(money/items);
	}
}
