import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HPIB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		String[] strings = new String[n];
		
//		System.out.println("*** " + n);
		for (int i = 0; i < n; i++) {
			String line = in.nextLine();
			strings[i] = line;
		}
		
		List<String> soFar = new ArrayList<String>();
		soFar.add(strings[0]);
		
		System.out.println(possible(soFar, Arrays.asList(strings).subList(1, n))
				? "YES" : "NO");
	}

	public static boolean possible(List<String> soFar, List<String> toDo) {

		
//		System.out.println(soFar + " + " + toDo);
		if (toDo.size() == 1) {
			return toDo.get(0).charAt(toDo.get(0).length() - 1) == soFar.get(0).charAt(0);
		}
		
		String word = soFar.get(soFar.size() - 1);
		char end = word.charAt(word.length() - 1);

		for (String string : toDo) {
			char start = string.charAt(0);

			if (start == end) {
//				System.out.println("HEEERE");
				List<String> ntd = new ArrayList<String>(toDo);
				ntd.remove(string);
				
				soFar.add(string);

				boolean res = possible(soFar, ntd);
				if (res)
					return true;
				else {
					soFar.remove(string);
				}
			}
		}
		
		return false;
	}
}
