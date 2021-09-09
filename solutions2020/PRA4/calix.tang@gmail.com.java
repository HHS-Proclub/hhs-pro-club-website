import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRA4 {
	public static int indexOfSubString(String big, String small) {
		return big.indexOf(small) + 1;
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String big = "";
		String small = "";
		String out = "";
		
		int pairs = Integer.parseInt(b.readLine());
		for (int i = 0; i < pairs; i++) {
			big = b.readLine();
			small = b.readLine();
			out += indexOfSubString(big,small) + "\n";
			big = small = "";
		}
		System.out.print(out);
	}

}
