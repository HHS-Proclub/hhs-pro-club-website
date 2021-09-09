import java.util.Scanner;
public class PRI1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int[] ans = new int[times];
		for(int i = 0; i < times; i++) {
			int b = sc.nextInt();
			int s = sc.nextInt();
			int h = sc.nextInt();
			if(b==0) {
				ans[i] = 0;
			}else if(s < b || h < b) {
				ans[i] = b - Integer.min(s,h)+1;
			}else if(s == b && h == b){
				ans[i] = 1;
			}
			
		}
		for(int i = 0; i < times; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
