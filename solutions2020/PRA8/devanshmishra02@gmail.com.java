import java.util.Scanner;

public class PRA8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		for(int i = 0; i < y; i++){
			int p = 1;
			int p2 = 0;
			int a = 1;
			int n = s.nextInt();
		
		
		
			while(a<n){
				a = p+p2;
				p2 = p;
				p = a;
			}
			if(a-n < n - p2){
				System.out.println(a-n);
			} else {
				System.out.println(n-p2);
			}
		}
	}
}
