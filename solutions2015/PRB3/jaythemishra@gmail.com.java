import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);
		 int x;
		 int y;
		 y = 0;
		 for (int n = a.nextInt(); n > 0; n--) {
			 x = a.nextInt();
			 if (x > y) {
				 y = x;
			 }
		 	}
		 System.out.println(y);
		 }
}

