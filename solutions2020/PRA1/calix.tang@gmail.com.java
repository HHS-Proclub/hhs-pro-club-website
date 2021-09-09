import java.util.Scanner;
public class PRA1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		String ans[] = new String[times];
		outer:
		for(int i = 0; i < times; i++) {
			String num = "" + sc.nextInt();
			if(num.charAt(0)=='4') {
				ans[i] = "NO";
				continue outer;
			}
			for(int j = 0; j < num.length(); j++) {
				if(num.charAt(j)!='1' && num.charAt(j)!='4') {
					ans[i]="NO";
					continue outer;
				}
			}
			for(int j = 0; j < num.length()-2; j++) {
				if(num.substring(j, j+3).equals("444")) {
					ans[i] = "NO";
					continue outer;
				}
			}
			ans[i] = "YES";
		}
		for(int i = 0; i < times; i ++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
