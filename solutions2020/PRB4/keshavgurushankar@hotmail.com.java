//package PR_4;

import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		for (int i = 1; i<(y+1);i++){
			System.out.println(x*i);
			}
		
		in.close();
	}
}
