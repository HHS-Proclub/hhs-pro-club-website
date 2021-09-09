

import java.util.Scanner;

public class PRA5 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int descend = B*N;
		int ascend = 0;
		
		while (ascend<=(descend-B)){
			ascend += A;
			descend -= B;
		}
		System.out.println(Math.min(descend, ascend));
		in.close();
	}
	
}
