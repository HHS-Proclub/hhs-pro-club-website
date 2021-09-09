import java.io.*;
import java.util.*;

class PRA1 {
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(f.readLine());
		int x = Integer.parseInt(st.nextToken());
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < x; i++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			a++;
			while(Integer.toString(a).charAt(0) == Integer.toString(a).charAt(1) || Integer.toString(a).charAt(0) == Integer.toString(a).charAt(2) || Integer.toString(a).charAt(0) == Integer.toString(a).charAt(3) || Integer.toString(a).charAt(1) == Integer.toString(a).charAt(2) || Integer.toString(a).charAt(1) == Integer.toString(a).charAt(3) || Integer.toString(a).charAt(2) == Integer.toString(a).charAt(3)) {
				a++;
			}
			r.add(a);
		}
		for(int j = 0; j < x; j++) {
			out.println(r.get(j));
		}
		out.close();
	}
}
