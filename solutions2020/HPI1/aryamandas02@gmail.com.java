import java.math.BigInteger;
import java.util.Scanner;

public class HPI1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strArray = s.split(" ");
        BigInteger num1 = new BigInteger(strArray[0]);
        BigInteger num2 = new BigInteger(strArray[1]);

        BigInteger gcf = gcf(num1, num2);
        BigInteger lcm = gcf.multiply((num1.divide(gcf))).multiply(num2.divide(gcf));

        System.out.println(gcf);
        System.out.println(lcm);

        in.close();

    }
    public static BigInteger gcf(BigInteger num1, BigInteger num2) {
        if (num2.equals(BigInteger.ZERO)) {
            return num1;
        }
        BigInteger remainder = num1.remainder(num2);
        return gcf(num2, remainder);

    }
}
