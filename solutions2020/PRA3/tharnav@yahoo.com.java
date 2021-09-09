import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = kboard.nextInt();
		for (int i = 0; i < x; i++) {
			int n = kboard.nextInt();
			int k = kboard.nextInt();
			int a = kboard.nextInt()-1;
			int[] people = new int[n];
			for(int ik = 0; ik < n; ik++) {
				people[ik] = 1;
				k--;
			}
			int counter = 0;
			while(k >= 0) {
				people[a]++;
				k--;
				for(int ij = a+1; ij < a+counter; ij++) {
					if(ij < people.length) {
					people[ij]++;
					k--;
					}
				}
				for(int ij = a-1; ij >= a-counter; ij--) {
					if(ij >=0) {
					people[ij]++;
					k--;
					}
				}
				counter++;
			}
			System.out.println(people[a]-1);
		}
	}
}
