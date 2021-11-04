import java.util.Scanner;

public class PRA1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long lines = s.nextLong();
        for (int i = 0; i < lines; i++) {
            long a = s.nextLong();
            while (GCD(a, sumOfDigits(a)) <= 1) {
                a++;
            }
            System.out.println(a);
        }

    }

    private static long sumOfDigits(long x) {
        if (x < 10) {
            return x;
        }
        return x % 10 + sumOfDigits(x / 10);
    }

    private static long GCD(long a, long b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int k;
        for (k = 0; ((a | b) & 1) == 0; ++k) {
            a >>= 1;
            b >>= 1;
        }
        while ((a & 1) == 0)
            a >>= 1;
        do {
            while ((b & 1) == 0)
                b >>= 1;
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }

            b = (b - a);
        } while (b != 0);
        return a << k;
    }
}
