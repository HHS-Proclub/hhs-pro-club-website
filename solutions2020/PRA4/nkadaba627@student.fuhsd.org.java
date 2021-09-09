import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boolean OK = false;
		while(!OK) {
	     if (a+b>c && a+c>b && b+c>a) {
		  OK = true;
		 }	
		 if (OK) {
			 int ans = a+b+c;
		  System.out.println(ans);
		 }	
		 if (a>b && a>c) {
		  a = a-1;
		 }
		 if (b>a && b>c) {
		  b = b-1;
		}
		if (c>b && c>a) {
		 c = c-1;
		}	
	   }
	}
}
