import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 int n = s.nextInt();
		 int a, b, c;
		 int[] p;
		 
		 for (int i = 0; i < n; i++) {
			 a = s.nextInt();
			 b = s.nextInt();
			 c = s.nextInt();
			 
			 p = new int[a];
			 for (int j = 0; j < a; j++) {
				 p[j] = s.nextInt();
			 }
			 
			 // rest of solution
			 
			 System.out.println(answer);
		 }
	}

}
