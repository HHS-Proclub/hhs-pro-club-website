import java.util.Scanner;
public class PRB8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] points = new int[n];
		for(int i = 0; i < n; i++) {
			int numQ = in.nextInt();
			int numR = in.nextInt();
			int numW = numQ-numR;
			int target = in.nextInt();
			int count = 0;
			points[i] = 0;
			int countReached = 0;
			for(int j = 0; j<numQ; j++) {
				if(count == target -1 && numW!=0) {
					numW--;
					count = 0;
				}
				else {
					count++;
				}
				
				if(count == target) {
					countReached++;
					count = 0;
				}
			}
			for(int j =0; j< countReached;j++) {
				points[i] = (points[i]+target) * 2;
			}
			points[i]+=numR-countReached*target;
		}
		for(int i : points)
			System.out.println(i);
		in.close();
	}
}
