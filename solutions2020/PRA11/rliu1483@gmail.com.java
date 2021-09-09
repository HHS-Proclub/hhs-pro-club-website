import java.util.*;
import java.io.*;

public class PRA11 {	
	public static void main(String[] args) throws IOException {
		Input in = new Input(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for(int testCases=in.nextInt(); testCases>0; testCases--) {
			solve(1, in, out);
		}
		out.close();
	}
	
	public static void solve(int testNumber, Input in, PrintWriter out) {
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = in.nextInt();
		}
		
		out.println(findLIS(array));
	}
	
	public static int findLIS(int[] nums) {
		if(nums==null || nums.length==0)
			return 0;

		ArrayList<Integer> list = new ArrayList<Integer>(); 

		for(int num : nums) {
			if(list.size()==0||num>list.get(list.size()-1))
				list.add(num);
			else {
				int i = 0; 
				int j = list.size()-1;

				while(i<j) {
					int mid = (i+j)/2;
					if(list.get(mid)<num) {
						i = mid+1;
					} else j = mid;
				}
				list.set(j, num);
			}
		}
		
		return list.size();
	}
	
	static class Input {
		BufferedReader br;
		StringTokenizer st;
		
		Input(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream));
		}
		
		Input(String file) {
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (Exception e) {}
		}
		
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}