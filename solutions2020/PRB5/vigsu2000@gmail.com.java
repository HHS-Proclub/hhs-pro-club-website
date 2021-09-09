import java.util.ArrayList;
import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		String[] A = scan.nextLine().split(" ");
		String[] B = scan.nextLine().split(" ");
		for(int i = 0; i < A.length; i++) {
			a.add(Integer.parseInt(A[i]));
		}
		for(int i = 0; i < B.length; i++) {
			b.add(Integer.parseInt(B[i]));
		}
		int maxA = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i)>maxA&&a.get(i)%10==0) {
				maxA = a.get(i);
			}
		}
		int maxB = 0;
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i)>maxB&&b.get(i)%10==0) {
				maxB = b.get(i);
			}
		}
		System.out.println(maxA+maxB);
	}
}
