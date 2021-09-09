import java.math.BigInteger;
import java.util.Scanner;

public class HPI1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] parts = string.split(" ");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        long aLong = Long.parseLong(part1);
        long bLong = Long.parseLong(part2);
        BigInteger a = BigInteger.valueOf(aLong);
        BigInteger b = BigInteger.valueOf(bLong);

        BigInteger GCD = a.gcd(b);
        BigInteger LCM = a.multiply(b.divide(GCD));
        System.out.println(GCD);
        System.out.println(LCM);

    }

}
