//package homesteadhacks;

import java.io.IOException;
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int k = 0;k < n;k ++) {
			int num = sc.nextInt();
			int castle [];
			castle = new int[num];
			for(int i = 0;i < num;i ++) {
				castle[i] = sc.nextInt();
			}
			int g = 0;
			for(int i = 1;i < num-1;i ++) {
				if(castle[i] == 0 && castle[i-1] == 1 && castle[i+1] == 1) {
					castle[i+1] = 0;
					g ++;
				}
			}
			System.out.println(g);
		}
	}
}
