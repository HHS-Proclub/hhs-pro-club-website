import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[4];
		int[] B = new int[2];
		
		for(int x = 0; x < 4; x++) { 
			A[x] = sc.nextInt();
		}
		for(int x = 0; x < 2; x++) { 
			B[x] = sc.nextInt();
		}
		
		int largestA = 0, largestB = 0;
		
		for(int x = 0; x < 4; x++) { 
			if(A[x] % 10 == 0 && A[x] / 10 > largestA/10) {
				largestA = A[x];
			}
		}
		
		for(int x = 0; x < 2; x++) {
			if(B[x] % 10 == 0 && B[x] / 10 > largestB) {
				largestB = B[x];
			}
		}
		
		System.out.println(largestA + largestB);
	}

}
