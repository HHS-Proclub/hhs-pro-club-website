import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class B1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(in.readLine());
			if(x == 1) {
				System.out.println(x);
			} else {
				DecimalFormat df = new DecimalFormat("#.###############");
				System.out.println(df.format(calcPi(x)));
			}
		}
	}
	
	private static double calcPi(int n) {
		double re = 0;
		double sign = -1;
		for(int i = 0; i < n; i++) {
			double d = 1.0/(1+2*i);
			sign *= -1;
			re += sign*d;
		}
		
		return re;
	}
}
