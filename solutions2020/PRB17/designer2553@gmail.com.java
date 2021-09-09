
import java.util.*;

class PRB17
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		long numCrates = in.nextInt();
		long loadSize = in.nextInt();
		System.out.println(loadCrates(numCrates, loadSize));
	}
	
	public static long loadCrates (long numCrates, long loadSize) {
		if (numCrates <= loadSize) {
			return 1;
		} else {
			long a = numCrates / 2;
			long b = numCrates - a;
			return loadCrates(a, loadSize) + loadCrates(b, loadSize);
		}
	}
}