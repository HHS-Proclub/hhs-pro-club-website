import java.io.*;
import java.util.*;

public class PRA17 {

	public static void main(String[] Args) throws IOException{
		Scanner s = new Scanner(System.in);
		int q = Integer.parseInt(s.nextLine());
		int g = Integer.parseInt(s.nextLine());
		
		System.out.println(rec(g) - rec(q));
	}

	public static long rec(int n){
		if (n == 1)		return 1;
		if (n % 2 == 1)	return n + rec(n - 1);
		else			return (n * n) / 4 + rec(n / 2);
	}
}