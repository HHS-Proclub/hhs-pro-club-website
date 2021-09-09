import java.io.*;
import java.util.*;

public class PRA9 {

	public static void main(String[] Args) throws IOException{
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());

		for(int i = 0; i < cnt; i++){
			FT<Integer> ft = new FT<Integer>();
			String[] arr = s.nextLine().split(" ");
			for(String str : arr) ft.put(Integer.parseInt(str) % 7);
			System.out.println(ft.keySet().size());
		}
		
	}
}
class FT<T> extends HashMap<T, Integer> {
	private static final long serialVersionUID = 4683664328575458213L;

	public Integer get(Object key) {
		return containsKey(key) ? super.get(key) : 0;
	}
	public Integer put(T t){
		return put(t, get(t) + 1);
	}
}