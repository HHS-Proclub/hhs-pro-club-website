import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int n = 0; n < cases; n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			//System.out.println(a+" "+b+" "+c);
			ArrayList<Integer> A = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int p = sc.nextInt();
				int j = sc.nextInt();
				if(j == 0) {
					//System.out.println(p+" "+j);
					A.add(p);
				} else {
					//System.out.println(p+" "+j);
					B.add(p);
				}
			}
			Collections.sort(A);
			Collections.sort(B);
			//for(int i = 0; i < A.size(); i++){
				//System.out.println(A.get(i)+" ");
			//}
			//System.out.println();
			//for(int i = 0; i < B.size(); i++){
				//System.out.println(B.get(i)+" ");
			//}
			int X = 0;
			int Y = 0;
			int comp = 0;
			long cost = 0;
			for(int x = 0; x < a; x++) {
				X = x;
				if(x == A.size()) {
					break;
				} else {
					comp ++;
					cost += A.get(x);
					//System.out.println(A.get(x));
				}
				if(x == a-1) {
					X++;
				}
			}
			for(int y = 0; y < b; y++) {
				Y = y;
				if(y == B.size()) {
					break;
				} else {
					comp++;
					cost += B.get(y);
					//System.out.println(B.get(y));
				}
				if(y == b-1) {
					Y++;
				}
			}
			for(int q = 0; q < X; q++) {
				A.remove(0);
			}
			for(int r = 0; r < Y; r++) {
				B.remove(0);
			}
			for(int i = 0; i < B.size(); i++) {
				A.add(B.get(i));
			}
			Collections.sort(A);
			
			for(int z = 0; z < c; z++) {
				if(z >= A.size()) {
					break;
				} else {
					comp++;
					cost += A.get(z);
					//System.out.println(A.get(z));
				}
			}
			System.out.println(comp+" "+cost);
		}
	}
}
