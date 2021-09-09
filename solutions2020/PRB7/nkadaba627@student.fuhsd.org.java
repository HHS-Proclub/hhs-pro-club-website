import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String line = sc.nextLine();
		String[] inValues = line.split(" ");
		int[] values = new int[inValues.length];
		for (int i = 0; i < inValues.length; i++) {
			values[i] = Integer.parseInt(inValues[i]);
		}
		int b = Integer.parseInt(sc.nextLine());
		sc.close();
		int d = 0;
		for (int k = 0; k < a; k++) {
			if(b == values[k]){
				d++;
			}
		}
		System.out.println((int)(100*((double)d/(double)a)));

	}

}
