import java.util.Scanner;

public class PRB19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] result =  new int[cases];
		for(int i = 0 ; i < cases; i++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			result[i] = candiesToEatCount(A, B, C);
		}
		for(int c : result){
			System.out.println(c);
		}
	}

	private static int candiesToEatCount(int a, int b, int c) {
		int sum = 0;
		while(a >= b || b >= c){
			int difference = c-b;
			if(difference <= 0){
				int dif = Math.abs(difference);
				sum += dif +1;
				b-=dif+1;
			}
			difference = b-a;
			if(difference <= 0){
				int dif = Math.abs(difference);
				sum += dif + 1;
				a-=dif +1;
			}
		}
		if(a > 0 && b > 0 && c > 0){
			return sum;
		}
		return -1;
	}
}
