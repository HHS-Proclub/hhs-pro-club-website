import java.util.*;
public class PRA6 {
	private static FT<String> ft = new FT<String>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a = s.next(), b = s.next(), w = draw(n, a, b);

		System.out.println(w + " " + Math.abs(count(n)));
	}
	public static String draw(int n, String a, String b){
		if(n == 1 || n == 2 || n == 4)	return a;
		if(n % 3 == 0)	return b;
		if((n - 1) % 3 == 0) return draw(n - 1, b, a);
		return draw(n - 2, b, a);
	}
	private static int count(int n) {
		int me = 0, them = 0, counts = 0;
		int[] arr = {4, 2, 1};
		if (n == 0)	return -1;
		else for(int a : arr)
			if (n >= a) {
				counts = -count(n - a);
				if (counts > 0) me += counts;
				else them += -counts;
			}
		if(me != 0) return me;
		return -them;
	}
}

class FT<T> extends HashMap<T, Integer> {
	private static final long serialVersionUID = -7771388843724296561L;
	public Integer get(Object key) {return containsKey(key) ? super.get(key) : 0;}
	public Integer put(T t){return put(t, get(t) + 1);}
}