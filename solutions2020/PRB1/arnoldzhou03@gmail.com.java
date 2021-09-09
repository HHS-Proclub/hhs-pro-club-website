import java.io.*;
import java.util.*;

class PRB1 {
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(f.readLine());
		int x = Integer.parseInt(st.nextToken());
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < x; i++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			r.add(a + b);
		}
		for(int j = 0; j < x; j++) {
			out.println(r.get(j));
		}
		out.close();
	}
}
