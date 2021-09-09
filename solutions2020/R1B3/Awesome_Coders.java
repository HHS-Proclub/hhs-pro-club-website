import java.util.Scanner;


public class R1B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R1B3 r = new R1B3();
        int range = in.nextInt();

        System.out.println(r.sumOfPrimes(range));

        in.close();
    }
    public boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            int remainder = number % i;

            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimes(int range) {
        int sum = 0;

        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
