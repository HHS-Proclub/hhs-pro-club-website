//package PR_3;

import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int step = in.nextInt();
		
		for (int i = 0; i<step;i++){
			int test = in.nextInt();
			
			for (int j = 1; j<=test;j++){
				if (test%j==0){
					System.out.println(j);
				}
			}
		}
		in.close();
	}

}
