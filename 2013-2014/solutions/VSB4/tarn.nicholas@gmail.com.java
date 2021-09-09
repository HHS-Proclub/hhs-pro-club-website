import java.util.Scanner;
public class VSB4 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String n = kboard.next();
		String s1 = n.replace("*"," ");
		System.out.println(s1);
	}

}
