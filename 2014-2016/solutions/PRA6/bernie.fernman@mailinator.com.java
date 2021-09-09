import java.util.*;
public class PRA6 {
	static FrequencyTable<String> ft = new FrequencyTable<String>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a = s.next(), b = s.next();
		
		String w = draw(n, a, b);
		count(n, a, b, 0);
		System.out.println(w + " " + ft.get(w));
	}
	public static String draw(int n, String a, String b){
		if(n == 1 || n == 2 || n == 4)	return a;
		if(n % 3 == 0)	return b;
		
		if((n - 1) % 3 == 0) return draw(n - 1, b, a);
		if(n >= 4 && (n - 4) % 3 == 0) return draw(n - 4, b, a);
		if((n - 2) % 3 == 0) return draw(n - 2, b, a);
		
		return null;
	}
	public static void count(int n, String a, String b, int c){
		if(n == 1 || n == 2 || n == 4){
			ft.put(a);	return;
		}
		
		count(n - 1, b, a, c + 1);
		if(n >= 2) count(n - 2, b, a, c + 1);
		if(n >= 4) count(n - 4, b, a, c + 1);
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