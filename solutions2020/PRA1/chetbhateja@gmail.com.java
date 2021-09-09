import java.util.*;
import java.io.*;
public class PRA1{
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 5; i ++) {
			st = new StringTokenizer (br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			System.out.println(o >= Math.max(g % 5, g - f * 5));
		}
	}
}