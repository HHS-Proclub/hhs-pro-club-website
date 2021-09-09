import java.io.*;
import java.util.*;

public class PRB7 {

	public static void main(String[] Args) throws IOException{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		FrequencyTable<String> ft = new FrequencyTable<String>();
		
		int denom = 0;
		st = new StringTokenizer(f.readLine());
		while(st.hasMoreTokens()){
			ft.put(st.nextToken());
			denom++;
		}
		
		st = new StringTokenizer(f.readLine());
		double num = ft.get(st.nextToken());
			
		int per = (int) (100 * (num / denom));
		
		System.out.println(per);
	}
}

class FrequencyTable<T> extends HashMap<T, Integer> {
	private static final long serialVersionUID = 4683664328575458213L;

	public Integer get(Object key) {
		return containsKey(key) ? super.get(key) : 0;
	}
	public Integer put(T t){
		return put(t, get(t) + 1);
	}
}