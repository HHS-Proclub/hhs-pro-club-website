import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;


public class B4 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
		
		String s = in.readLine();
		
		int n = Integer.parseInt(in.readLine());
		
		HashMap<String,String> hm = new HashMap<String,String>();
		String[] keys = new String[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(),"|");
			String key = st.nextToken();
			String value = st.nextToken();
			keys[i] = key;
			hm.put(key, value);
		}
		
		Arrays.sort(keys, new Comparator<String>(){
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		
		for(int i = 0; i < keys.length; i++) {
			String ss = keys[i];
			s = s.replace(ss, hm.get(ss));
		}
		
		System.out.println(s);
	}
	
}