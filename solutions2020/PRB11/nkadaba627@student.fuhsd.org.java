import java.util.Scanner;

public class PRB11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		String[] a = line.split(" ");
		System.out.print((int)(0.5*(Integer.parseInt(a[0])*Math.sin(Integer.parseInt(a[1])*Math.PI/180))*Integer.parseInt(a[0])*Math.cos(Integer.parseInt(a[1])*Math.PI/180)));
	}
}
