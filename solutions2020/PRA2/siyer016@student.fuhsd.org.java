import java.math.BigInteger;
import java.util.Scanner;

public class PRA2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] solutions = new String[n];
        for(int i = 0; i < n; i++) {
            int a = input.nextInt();
            StringBuffer s = new StringBuffer(a + "");
            s.reverse();
            int b = Integer.parseInt(s.toString());
            if(b != a && BigInteger.valueOf(a).isProbablePrime(10000) && BigInteger.valueOf(b).isProbablePrime(10000)) {
                solutions[i] = "YES";
            } else {
                solutions[i] = "NO";
            }
        }

        for(String s : solutions) System.out.println(s);
    }
}