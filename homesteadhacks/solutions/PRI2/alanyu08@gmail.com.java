import java.util.Scanner;
import java.util.ArrayList;
public class PRI2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int S = sc.nextInt();
			int L = 0, nin, nxtint, totCost = 0;
			ArrayList<Integer> stuff = new ArrayList<Integer>(); 
			for (int c=0;c<S;c++) {
				nin = sc.nextInt();
				if (nin > L) {
					L = nin;
				}
				stuff.add(nin);
			}
			for (int j=0;j<S;j++) {
				nxtint = stuff.get(j);
				totCost += (L - nxtint);
			}
			System.out.println(totCost);
		}
		sc.close();
	}

}
