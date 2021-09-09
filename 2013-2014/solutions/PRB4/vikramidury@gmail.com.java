import java.util.Scanner;


public class PRB4 {

	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		StringBuffer string = new StringBuffer(kboard.nextLine());
		System.out.println(string.toString().equals(string.reverse().toString()));
	}
	
}
