import java.util.Scanner;

public class PRB2 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		int low = s.nextInt();
		int hi = s.nextInt();
		
		int tot = 0;
		int cnt = 0;
		for(int i = low; i < hi; i ++)
			if(i > 0){
				tot += i;
				cnt ++;
			}
		
		System.out.println(tot / (double) cnt);
		
	}
}