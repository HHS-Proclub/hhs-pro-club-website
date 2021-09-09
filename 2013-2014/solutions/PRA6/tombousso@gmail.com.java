import java.util.*;
import java.lang.*;
import java.io.*;
class PRB4
{
	public static void main (String[] args)
	{
		String s = new Scanner(System.in).nextLine();
		System.out.println(new StringBuilder(s).reverse().toString().equals(s));
	}
}