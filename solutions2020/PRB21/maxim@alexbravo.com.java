import java.util.Scanner;

public class PRB21 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		System.out.println(getMaxPoints(A, B, C, N));
	}
	public static int getMaxPoints(int a, int b, int c, int n){
		int thisTurn = 0;
		if(n == 0){
			return 0;
		}
		if(a >= b){
			if(a >= c){
				thisTurn = a;
				a--;
			} else {
				thisTurn = c;
				c--;
			}
		} else if(b >= c){
			thisTurn = b;
			b--;
		} else {
			thisTurn = c;
			c--;
		}
		return thisTurn + getMaxPoints(a, b, c, n-1);
	}
}
