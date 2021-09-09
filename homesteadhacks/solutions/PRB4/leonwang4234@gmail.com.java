//package homesteadhacks;

import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k[];
		k = new int[n];
		for(int i = 0;i < n;i ++) {
			k[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i ++) {
			if(k[i]%2 == 0) {
				System.out.println("EVEN");
			}
			if(k[i]%2 == 1) {
				System.out.println("ODD");
			}
		}
	}
}
