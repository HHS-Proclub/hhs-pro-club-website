import java.util.Scanner;
public class PRB6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int answer;
		
		if(A+B+C+D == E){
			answer = E;
		}else if(A+B+C+E == D){
			answer = D;
		}else if(A+B+D+E == C){
			answer = C;
		}else if(A+C+D+E == B){
			answer = B;
		}else if(B+C+D+E == A){
			answer = A;
		}else{
			answer = A+C+B+D+E;
		}
		System.out.println(answer);

	}

}
