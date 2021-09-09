//package R2;

import java.util.Scanner;

public class R2B3 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 0; i<cases; i++){
			int sum = 0;
			int num = in.nextInt();
			for (int j=1; j<num; j++){
				sum += (j*j);
			}
			System.out.println(sum);
		}
	}
}
