import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for (int i = 0; i < x; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			ArrayList<Long> arr = new ArrayList<Long>();
			ArrayList<Long> arr1 = new ArrayList<Long>();
			
			for (int j = 1; j <= n; j++) {
				
				long t = scan.nextLong();
				arr.add(t);
				arr1.add((long) 0);
			}
			if(arr.size() >= 2) {
				boolean keepGoing = true;
				while (keepGoing) {
					if (arr.get(0) > arr.get(1)) {
						arr.add(arr.remove(1));
						arr1.set(0, arr1.get(0) + 1);
						arr1.remove(1);
						arr1.add((long) 0);
						
					} else {
						arr.add(arr.remove(0));
						arr1.set(1, arr1.get(1) + 1);
						arr1.remove(0);
						arr1.add((long) 0);
						
					}
//					for (int j = 0; j < arr1.size(); j++) {
						if (arr1.get(0) >= k) {
							keepGoing = false;
							System.out.println(arr.get(0));
						}
//					}
				}
			} else {
				System.out.println(arr.get(0));
			}
		}
		scan.close();

	}

}
