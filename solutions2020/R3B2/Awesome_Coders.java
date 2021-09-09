import java.util.Scanner;

public class R3B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R3B2 r = new R3B2();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double l = in.nextDouble();

        System.out.println(r.lapsRun(a, b, l));
        in.close();
    }
    public int lapsRun(double a, double b, double l) {
        return (int) (l * b / a);

    }
}
