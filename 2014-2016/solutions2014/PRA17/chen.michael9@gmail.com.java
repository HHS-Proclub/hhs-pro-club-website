import java.util.Scanner;


public class PRA17 {
	static boolean isLeap(int y)
	{
	    if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
	        return true;
	    return false;
	}

	static int nextYear(int y)
	{
	    int year = y + 1;
	    int d = 0;
	    boolean bool = true;
	    while (bool)
	    {
	        if (isLeap(year)) d += 2;
	        else d+= 1;
	        year += 1;
	        d = d % 7;
	        if (d == 0) bool = false;
	    }
	    return year - 1;
	}

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
	    int n = Integer.parseInt(kboard.next());
	    int[] years = new int[1000];
	    for (int i = 0; i < n; i++)
	    {
	        years[i] = Integer.parseInt(kboard.next());
	    }
	    for (int i = 0; i < n; i++)
	    {
	        System.out.println(nextYear(years[i]));
	    }
	}
}
