import java.util.Scanner;


public class PRB5 {
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);
	String i = kboard.nextLine();
	simplify(i);
	System.out.print(simplify(i));
	kboard.close();
	}
	
	public static String simplify(String i)
	{
		
		String s = i.replace(" not not", "");
		return s;
	}
}
//"the best solution to a problem is usually the easiest one"
//Tiffany Wu