import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i<x; i++) {
			System.out.println(findSpecialDivisor(sc.nextInt()));
		}
		
	}

	private static int findSpecialDivisor(int nextInt) {
		// TODO Auto-generated method stub
		int k = nextInt;
		while(k>=0) {
			if(nextInt%((Math.pow(2, k)-1)*Math.pow(2, k-1))==0) {
				return (int)((Math.pow(2, k)-1)*Math.pow(2, k-1));
			}
			k--;
		}
		return 0;
	}
	
}
