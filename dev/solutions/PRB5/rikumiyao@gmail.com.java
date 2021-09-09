import java.util.Scanner;
public class PRB5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String answer = s.replaceFirst("not not ", "");
		System.out.println(answer);
	}
}
