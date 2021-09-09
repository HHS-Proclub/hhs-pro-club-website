import java.util.Arrays;
import java.util.Scanner;

public class PRB12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numTest = s.nextInt();
		for(int i= 0; i <= numTest; i++){
			String temp = s.nextLine();
			System.out.println(temp.substring(0,temp.length()/2));
		}
	}
}