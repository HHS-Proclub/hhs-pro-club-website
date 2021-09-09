import java.util.Scanner;

public class PRA13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA13 p = new PRA13();

        long w = in.nextLong();
        long h = in.nextLong();
        long m = in.nextLong();

        System.out.println(p.bricks(w, h, m));

        in.close();

    }
    public long bricks(long w, long h, long m) {
        long i = w;

        while (m > 0) {
            if (i != 0) {
                if (m % i != 0) {
                    i--;

                } else if (m % i == 0 && (m / i) > h) {
                    i--;

                } else {
                    return m;
                }

            } else {
                m--;
                i = w;
            }
        }
        return 0;
    }
}