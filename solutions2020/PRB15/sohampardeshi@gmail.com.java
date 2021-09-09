import java.io.*;
import java.util.*;
import static java.lang.Math.min;

public class PRB15 {

	public static void main(String[] Args) throws IOException{
		Scanner s = new Scanner(System.in);
		int q = Integer.parseInt(s.nextLine());
		int g = Integer.parseInt(s.nextLine());
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println(min(q - g, q - a) + min(g, a));
	}
	
}