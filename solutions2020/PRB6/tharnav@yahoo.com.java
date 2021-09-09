import java.util.Scanner;

public class PRB6 {
	
	public static void main(String[] args) {
		
		Scanner Kboard = new Scanner(System.in);
		int[] a = new int[5];
		int total = 0;
		int answer = 0;
		boolean yesOrNo = false;
		
		for(int i = 0; i <= 4; i++) {
			a[i] = Kboard.nextInt();
			total = total + a[i];
		}
		
		for(int i = 0; i <= 4; i++) {
			if(total - a[i] == a[i]) {
				yesOrNo = true;
				answer = a[i];
			}
		}
		
		if (yesOrNo = true) {
			System.out.println(answer);
		} else {
			System.out.println(a[1]+a[2]+a[3]+a[4]+a[5]);
		}
	}
	
}
