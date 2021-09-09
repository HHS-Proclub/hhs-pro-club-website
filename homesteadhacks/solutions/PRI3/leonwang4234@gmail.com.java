//package homesteadhacks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PRI3 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int k = 0;k < n;k ++) {
			int nums = sc.nextInt();
			int j [];
			j = new int[nums];
			for(int i = 0;i < nums;i ++) {
				j[i] = sc.nextInt();
			}
			int max = 0;
			for(int i = 0;i < nums;i ++) {
				int num = 1;
				for(int i2 = 0;i2 < nums;i2 ++) {
					if(i != i2) {
						if(j[i] == j[i2]) {
							num ++;
						}
					}
				}
				if(num > max) {
					max = num;
				}
			}
			System.out.println(max);
		}
	}
}
