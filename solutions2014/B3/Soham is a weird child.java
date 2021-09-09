import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;


public class B3 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(in.readLine());
		int bit = Integer.parseInt(in.readLine());
		int r = 0, multi = 1;
		for(int i = 0; i < bit; i++) {
			r+=multi;
			multi = multi*2;
		}
		
		System.out.println(n & r);
	}
}
