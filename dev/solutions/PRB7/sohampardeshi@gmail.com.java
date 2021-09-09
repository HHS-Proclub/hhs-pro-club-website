import java.util.Scanner;


public class PRB7 {
	public static void main(String[] Args){
		Scanner inputReader = new Scanner(System.in);
		int n = Integer.parseInt(inputReader.nextLine());

		for(int i = 0; i < n; i++) {
			String p = inputReader.nextLine();
			String[] arr = p.split("\\s");
			double x, y, z;
			x = Integer.parseInt(arr[0]); y = Integer.parseInt(arr[1]); z = Integer.parseInt(arr[2]);
			if ( y - x == z - y )
				System.out.println((int)(z + y - x));

			else
				System.out.println((int)(z / ((double)x / y)));
			
		}
	}
}
