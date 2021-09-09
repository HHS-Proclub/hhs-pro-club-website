import java.util.*;
import java.lang.*;
import java.io.*;

class Strings
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		s.close();
		if(s1.equals(s2)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not");
		}
	}
}