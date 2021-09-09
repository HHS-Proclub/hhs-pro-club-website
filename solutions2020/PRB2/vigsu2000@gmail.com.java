import java.util.Scanner;

//BOWLING SCORES
public class PRB2 {
	public static int calcScore(int s1, int s2, int s3, int s4, int s5) {
		return s1+s2+s3+s4+s5;
	}
	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int s5 = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			if(i==0) {
				s1 = scan.nextInt();
			}
			if(i==1) {
				s2 = scan.nextInt();
			}
			if(i==2) {
				s3 = scan.nextInt();
			}
			if(i==3) {
				s4 = scan.nextInt();
			}
			if(i==4) {
				s5 = scan.nextInt();
			}
		}
		System.out.println(calcScore(s1, s2, s3, s4, s5));
	}
}
