import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PRA26 {
    public static void main(String[] args) {
        PRA26 p = new PRA26();
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            int n = in.nextInt();
            int highestIndex = (int) (Math.log(n) / Math.log(2));

            outputs.add(p.varunsCoins(highestIndex, n));
        }
        for (long j : outputs) {
            System.out.println(j);
        }
        in.close();
    }

    public static void main2(String[] args) {
        PRA26 p = new PRA26();
        int n = 2;
        long result = p.varunsCoins(1, n);
        System.out.println(result);
    }
    public long varunsCoins(int index, long sumLeft) {
        if (sumLeft == 0) {
            return 1;
        }
        if (index < 0) {
            return 0;
        }

        if (sumLeft < 0) {
            return 0;
        }

        int currentcoin = (int) Math.pow(2,  index);
        /*
         * Do not use the current coin (2 ^ index)
         * 2nd case is use the current coin (2 ^ index)
         * 3rd case is use 2 of your current coins (2 ^ index)
         */
        /*
         * Do not use current coin
         */
        long a = varunsCoins(index-1, sumLeft);

        long b = 0;
        long c = 0;

        /*
         * Use the coin once if possible
         */
        if (sumLeft >= currentcoin) {
            b = varunsCoins(index-1, sumLeft - currentcoin);
        }

        /*
         * Use coin twice if possible
         */
        if (sumLeft >= currentcoin*2) {
            c = varunsCoins(index-1, sumLeft - currentcoin*2);
        }
        return a+b+c;
    }
}


