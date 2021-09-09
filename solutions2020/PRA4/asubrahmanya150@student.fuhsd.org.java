import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if(a>b&&a>c){
			while(c+b<=a){
				a = a -1;
			}
			System.out.println(a+b+c);
		}
		else if(b>a&&b>c){
			while(a+c<=b){
				b = b-1;
			}
			System.out.println(a+b+c);
		}
		else{
			while(c>=a+b){
				c = c-1;
			}
			System.out.println(a+b+c);
		}
		
	}

}
