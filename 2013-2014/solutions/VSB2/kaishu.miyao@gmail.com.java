import java.util.Scanner;
public class VSB2 {
	public static void main (String args[]){
		Scanner kbd = new Scanner(System.in);
		int n =kbd.nextInt();
		int m = kbd.nextInt();
		int sum = 0;
		for(int x= 1; x<=n; x++){
			sum+=m;
			System.out.println(sum);
		}
		
	}
}
