import java.util.Scanner;
public class VSB3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int m = kboard.nextInt();
		if(n>12) {
			System.out.println(n-12+" "+m+" PM");
		} else if(n==12){
			System.out.println(n+" "+m+" PM");
		} else if(n==0){
			System.out.println(n+12+" "+m+" AM");
		}else{
			System.out.println(n+" "+m+" AM");
		}
	}

}
