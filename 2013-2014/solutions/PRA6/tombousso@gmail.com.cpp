import java.lang.Math;
import java.util.Scanner;
import java.lang.Double;
public class PRA2{
    public static void main(String[] args){ ap2(); }
    public static void ap2(){
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		scanner.nextLine();
		String out = "";
		for(int i = 0; i < lines; i++){
			String[] dgs = scanner.nextLine().split(" ");
			double a = Double.parseDouble(dgs[0]);
			double b = Double.parseDouble(dgs[1]);
			double c = Double.parseDouble(dgs[2]);
			double d = Double.parseDouble(dgs[3]);
			double e = b / a;
			double f = c / a;
			double g = d / a;
			double p = f - Math.pow(e, 2.0 / 3.0);
			double q = 2.0 * Math.pow(e, 3.0) / 27.0 - e * f / 3.0 + g;
			double t = Math.abs((-1.0) / 2.0 * q + 1.0 / 2.0 * Math.pow(Math.pow(q, 2.0) + 4.0 * Math.pow(p, 3.0) / 27.0, 1.0 / 2.0));
			double u = Math.abs(1.0 / 2.0 * q + 1.0 / 2.0 * Math.pow(Math.pow(q, 2.0) + 4.0 * Math.pow(p, 3.0) / 27.0, 1.0 / 2.0));
			double z = Math.pow(t, 1.0 / 3.0) - Math.pow(u, 1.0 / 3.0);
			int ans = (int) Math.floor(Math.abs(1000000.0 * z));
			out += ans + "\n";
		}
		System.out.print(out);
    }
}