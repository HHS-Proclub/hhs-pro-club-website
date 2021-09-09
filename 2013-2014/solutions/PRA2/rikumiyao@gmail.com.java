//Programmed by YAYtears
/*
 * in:
   2
   1 0 0 2
   1 0 0 -2
 * out:
 * 1259921
 * 1259921
 * 
*/
import java.util.Scanner;
public class PRA2 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int multiplier = 1000000;
		double epsilon = 1.0/multiplier/1000;
		int[]results = new int[n];
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			double upper = 11.0;
			double lower = -11.0;
			//perform binary search
			while(upper-lower>epsilon){
				double x = (upper+lower)/2;
				double fx = calculate(a,b,c,d,x);
				if(fx<0){
					lower = x;
				}
				else if(fx>0){
					upper = x;
				}
				else{
					lower = x;
					upper = x;
				}
			}
			int result = Math.abs((int)(lower*multiplier));
			results[i] = result;
		}
		
		for(int k=0;k<n;k++){
			System.out.println(results[k]);
		}
	}
	
	public static double calculate(int a, int b, int c, int d, double x){
		return a*x*x*x+b*x*x+c*x+d;
	}
}
