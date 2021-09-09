import java.text.DecimalFormat;
import java.util.Scanner;

public class R3B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x1 = in.nextLine();
        String y1 = in.nextLine();
        String x2 = in.nextLine();
        String y2 = in.nextLine();

        double xPoint1 = Double.valueOf(x1);
        double yPoint1 = Double.valueOf(y1);
        double xPoint2 = Double.valueOf(x2);
        double yPoint2 = Double.valueOf(y2);


        if (xPoint2 - xPoint1 == 0) {
            System.out.println("na");
        } else {
            double slope = (yPoint2 - yPoint1) / (xPoint2 - xPoint1);
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println(df.format(slope));
        }
    }
}
