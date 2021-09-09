import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PRA11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			String[] accepted = in.nextLine().split(" ");
	//		String[] case2 = in.nextLine().split(" ");
	//		String[] case3 = in.nextLine().split(" ");
			
			Map<String, Integer> map = new HashMap<String, Integer> ();
			String leader = "";
			for (String n : accepted) {
				if (!map.containsKey(n)) {
					map.put(n, 1);
					
					if (leader.isEmpty()) leader = n;
				} else {
					map.put(n, map.get(n)+1);
					
					if (map.get(n) > map.get(leader)) {
						leader = n;
					}
				}
			}
			System.out.println(leader);
		}
	}

}
