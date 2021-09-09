import java.util.*;

public class PRB5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String p = s.next();
		
		FrequencyTable<Character> ft = new FrequencyTable<Character>();
		char[] arr = p.toCharArray();
		
		for(char c: arr)
			ft.put(c);
		
		Arrays.sort(arr);
		
		char q = ' ';
		for(char c: arr){
			if(c != q)
				System.out.println(c + " " + ft.get(c));
			q = c;
		}
	}
}
class FrequencyTable<T> extends HashMap<T, Integer> {
	@Override
	public Integer get(Object key) {
		return containsKey(key) ? super.get(key) : 0;
	}
	public Integer put(T t){
		return put(t, get(t) + 1);
	}
}