import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
public class PRA3_1 {
	
	//arr should be sorted & contents should add up to length
	public static int findMinEnergy(LinkedList<Integer> l, int length) {
		int sum = 0;
		while(l.size()>1) {
			sum += (l.peekFirst() + l.get(1));
			l.set(1, l.get(1) + l.peekFirst());
			l.pop();
			Collections.sort(l);
		}
		if(l.size()==1) {
			return sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> pLengths = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		String str = "";
		int logs = sc.nextInt();
		for(int i = 0; i < logs; i++) {
			int logLength = sc.nextInt();
			int pieces = sc.nextInt();
			for(int j = 0; j < pieces; j++) {
				pLengths.add(sc.nextInt());
			}
			Collections.sort(pLengths);
			str += findMinEnergy(pLengths,logLength) + "\n";
			pLengths.clear();
		}
		System.out.print(str);
		sc.close();
	}

	
}
