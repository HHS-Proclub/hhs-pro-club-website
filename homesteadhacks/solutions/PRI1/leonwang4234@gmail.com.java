//package homesteadhacks;

import java.util.Scanner;

public class PRI1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k[][];
		k = new int[n][2];
		for(int i = 0;i < n; i ++) {
			k[i][0] = sc.nextInt();
			k[i][1] = sc.nextInt();
		}
		for(int i = 0;i < n; i ++) {
			int y = 0;
			while(true) {
				y++;
				k[i][0]*= 3;
				k[i][1]*= 2;
				if(k[i][0] > k[i][1]) {
					break;
				}

			}
			System.out.println(y);
		}
	}
}
