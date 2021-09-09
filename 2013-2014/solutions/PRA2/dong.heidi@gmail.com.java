import java.util.Scanner;
import java.math.*;

public class PRA2 {

	// based on instructions given at http://www.1728.org/cubic2.htm
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int eqnAmount = input.nextInt();
		input.nextLine();
		String abcd;
		double a, b, c, d, f,g,h,r,s,t,u;//p, q, r;
		String[] splitCoefficients = new String[4];
		double[] x = new double[eqnAmount];
		for(int i=0;i<eqnAmount;i++) {
			abcd = input.nextLine();
			splitCoefficients = abcd.split(" "); 
			a = Double.parseDouble(splitCoefficients[0]);
			b = Double.parseDouble(splitCoefficients[1]);
			c = Double.parseDouble(splitCoefficients[2]);
			d = Double.parseDouble(splitCoefficients[3]);
			f = ((3*c)/a-(b*b)/(a*a)) / 3;
			g = ((2*b*b*b)/(a*a*a) - (9*b*c)/(a*a) + (27*d)/a) / 27;
			h = (g*g)/4 + (f*f*f)/27;
			r = Math.pow(h,0.5) - g/2;
			s = Math.pow(r,(double)1/3);
			t = -(Math.pow(h,0.5)) - g/2;
			u = -(Math.pow(-t,(double)1/3));
			x[i] = s+u - b/(3*a);
			x[i] *= 1000000;
			x[i] = Double.parseDouble((x[i]+"").split("\\.")[0]);
			x[i] = Math.abs(x[i]);
		}
		for(int j=0;j<eqnAmount;j++) {
			System.out.println((int)x[j]);
		}
	}
	
}
