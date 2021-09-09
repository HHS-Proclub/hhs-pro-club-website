import java.util.*;
import java.lang.*;
import java.io.*;

class ArraySum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a[] = sc.nextLine().split(",");
		int s = 0;
		for(int i=0; i<5;i++){
			s += Integer.parseInt(a[i]);
		}
		System.out.println(s);
	}
}