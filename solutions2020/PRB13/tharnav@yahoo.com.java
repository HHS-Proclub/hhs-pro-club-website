import java.util.Scanner;

public class PRB13 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int k1 = Kboard.nextInt();
		int k2 = Kboard.nextInt();
		int k3 = Kboard.nextInt();
		int k4 = Kboard.nextInt();
		
		int numOf142s = 0;
		
		if(k1 <= k4 && k1 <= k2) {
			numOf142s = k1;
		} else if (k2 <= k4 && k2 <= k1) {
			numOf142s = k2;
		} else {
			numOf142s = k4;
		}
		
		int sum = numOf142s*142;
		
		k1-=numOf142s;
		k2-=numOf142s;
		k4-=numOf142s;
		
		if(k1 <= k2) {
			numOf142s = k1;
		} else {
			numOf142s = k2;
		}
		
		sum+=numOf142s*12;
		
		System.out.println(sum);
	}
}
