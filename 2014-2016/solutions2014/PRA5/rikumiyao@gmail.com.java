import java.util.*;
public class PRA5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 1;
		for(int x=0;x<n;x++){
			total*=2;
		}
		System.out.println(total-1);
	}
}