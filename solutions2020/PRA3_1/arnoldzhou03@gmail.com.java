
import java.io.*;
import java.util.*;

class PRA3_1 {
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(f.readLine());
		int x = Integer.parseInt(st.nextToken());
		int[] r = new int[x];
		for(int i = 0; i < x; i++) {
			ArrayList<Integer> segLengths = new ArrayList<Integer>();
			st = new StringTokenizer(f.readLine());
			int length = Integer.parseInt(st.nextToken());
			int segs = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(f.readLine());
			for(int j = 0; j < segs; j++) {
				segLengths.add(Integer.parseInt(st.nextToken()));
			}
			r[i] = new PRA3_1().sum(segLengths);
		}
		for(int i = 0; i < r.length; i++) {
			out.println(r[i]);
		}
		out.close();
	}

	int sum(ArrayList<Integer> k) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(k);
		int x = p.size()-1;
		int s = 0;
		for(int i = 0; i < x; i++) {
			Arrays.sort(p.toArray());
			int j = p.remove() + p.remove();
			s += j;
			p.add(j);
		} 
		return s;
	}
}