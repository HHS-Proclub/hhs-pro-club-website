import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B0 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n; i++) {
			System.out.println(in.readLine());
		}
		
	}
}
