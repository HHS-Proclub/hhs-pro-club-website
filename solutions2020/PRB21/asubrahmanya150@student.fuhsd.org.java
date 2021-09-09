//package advanced;

import java.util.Scanner;

public class PRB21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int N = in.nextInt();
		
		int points = 0;
		for(int i = 0; i < N; i++){
			if(A >= B && A >= C){
				points += A;
				A--;
			}
			else if(B >= C && B >= A){
				points += B;
				B--;
			}
			else{
				points += C;
				C--; //<<< Not C++?
			}
		}
		System.out.println(points);
	}

}
