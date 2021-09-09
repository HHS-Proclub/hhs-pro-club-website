//package R2;

import java.util.Scanner;

public class R2B2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max=in.nextInt();
		int num = 0;
		for (int i = 11; i<max; i++){
			if (reverse(i)==i){
				num++;
			}
		}
		System.out.println(num);
	}
	
	public static int reverse(int num)
	   {
	      String original, reverse = "";
	 
	      original = Integer.toString(num);
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- ){
	         reverse += original.charAt(i);
	         }
	    return Integer.parseInt(reverse);
	 
	   }
}
