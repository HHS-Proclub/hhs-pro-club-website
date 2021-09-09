import java.util.Scanner;
import java.util.ArrayList;
public class PRI3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ne;
		ArrayList<ArrayList<Integer>> pockets;
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int c = sc.nextInt();
			pockets = new ArrayList<ArrayList<Integer>>();
			ne = new ArrayList<Integer>();
			pockets.add(ne);
			int varr = 0;
			while (varr < c) {
				int r = sc.nextInt();
				varr++;
				boolean added = false;
				for (ArrayList<Integer> y : pockets){
					if (y.contains(r)) {
						added = false;
						continue;
					} else {
						y.add(r);
						added = true;
						break;
					}
				}
				if (added == false) {
					ne = new ArrayList<Integer>();
					ne.add(r);
					pockets.add(ne);
				}
			}
			System.out.println(pockets.size());
		}
		sc.close();
	}

}
