//package homesteadhacks;

import java.util.Scanner;

public class PRI2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i ++) {
			int nums = sc.nextInt();
			int studentwel[];
			studentwel = new int[nums];
			for(int i2 = 0;i2 < nums; i2 ++) {
				studentwel[i2] = sc.nextInt();
			}
			int max = 0;
			for(int i2 = 0;i2 < nums;i2 ++) {
				if(studentwel[i2] > max) {
					max = studentwel[i2];
				}
			}
			int pay = 0;
			for(int i2 = 0;i2 < nums;i2 ++) {
				pay += max-studentwel[i2];
			}
			System.out.println(pay);
		}
	}
}
