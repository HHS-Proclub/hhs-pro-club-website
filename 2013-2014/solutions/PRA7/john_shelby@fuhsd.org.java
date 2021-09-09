import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PRA7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Fraction> data = new ArrayList<Fraction>();
		
		int n = Integer.parseInt(s.nextLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				Fraction f = new Fraction(j,i);
				if (!data.contains(f))
					data.add(f);
			}
		}
		Collections.sort(data);
		for(Fraction f : data)
			System.out.println(f);

	}

}

class Fraction implements Comparable<Fraction> {
	int num;
	int denom;
	
	public Fraction(int n, int d) {
		num = n; denom = d;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Fraction))
			return false;
		Fraction other = (Fraction)o;
		double d = (double)num/denom;
		double f = (double)other.num/other.denom;
		if (Math.abs(d-f) < 0.000000001) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Fraction other) {
		double d = (double)num/denom;
		double f = (double)other.num/other.denom;
		if (Math.abs(d-f) < 0.000000001) {
			return 0;
		} else if (d > f)
			return 1;
		return -1;
	}
	
	public String toString() {
		return num+"/"+denom;
	}
	
	
}
