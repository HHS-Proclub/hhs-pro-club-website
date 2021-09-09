import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class B2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(in.readLine());
		
		if(n == 0) {
			System.out.println(0);
		}
		
		BigInteger re = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			re = re.multiply(new BigInteger(i+""));
		}
		
		
		String s = re.toString();
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			result += Integer.parseInt(s.substring(i, i+1));
		}
		
		System.out.println(result);
	}
}
