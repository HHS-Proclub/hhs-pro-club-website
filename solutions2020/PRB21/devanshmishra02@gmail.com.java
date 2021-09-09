import java.util.Scanner;
public class PRB21 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int N = s.nextInt();
		int total = 0;
		for(int i = 0; i < N; i++){
			if(A >= B && A >= C){
				total += A;
				A-=1;
			} else if(B >= C && B > A){
				total += B;
				B-=1;
			} else {
				total += C;
				C-=1;
			}
		}
		System.out.println(total);
	}
}
