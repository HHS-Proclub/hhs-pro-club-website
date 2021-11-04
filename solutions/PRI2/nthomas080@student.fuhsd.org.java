//package prob2;

import java.util.Scanner;

public class PRI2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		long[] answers = new long[num];
		
//		for (int i = 0; i < num; i ++) {
//			
//			String line = sc.nextLine();
//			
//			String[] arr = line.split("0");
//			
//			answers[i] += arr.length-1;
//			
//			for (String s : arr) {
//				
//				answers[i] += s.length() + 1;
//				
//			}
//			
//		}
		
		for (int i = 0; i < num; i ++) {
			
			String line = sc.nextLine();
			
			for (int k = line.length() - 1; k >= 0;) {
				
				if (k > 0 && line.charAt(k)=='1') {
					
					answers[i] += 2;
					k--;
					 
					while(k >=0 && line.charAt(k) == '1') {
						
						answers[i]++;
						k--;
						
					}
					
					if (k > 0)
						line = line.substring(0, k) + "1";
					
				} else if (k == 0 && line.charAt(k)=='1') {
					
					break;
					
				} else if (k >= 0) {
				
					answers[i]++;
					k--;
					
				}
				
			}
			
		}
		
		for (long i : answers) {
			
			System.out.println(i);
			
		}
		
		sc.close();

	}

}
