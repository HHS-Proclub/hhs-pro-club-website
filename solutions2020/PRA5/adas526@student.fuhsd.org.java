import java.util.Scanner;

public class PRA5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA5 p = new PRA5();
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(p.findMaxAltitude(n, a, b));

        in.close();
    }
    public int findMaxAltitude(int n, int a, int b) {
        if ((n < 2 && n > 50) && (a < 1 && a > 50) && (b < 1 && b > 50)) {
            return -1;
        }
        int[] altitudeArray = new int[n];
        int i = 0;

        while (i < altitudeArray.length) {
            if (a * (i+1) <= b*(n-i-1)) {
                altitudeArray[i] = a;
                i++;

            } else {
                int difference = (a * (i+1)) - (b*(n-i-1));
                int result = a - difference;

                if (result < 0) {
                    return a*i;

                } else {
                    altitudeArray[i] = result;
                    return a*i + altitudeArray[i];
                }
            }
        }
        return 0;
    }

}
