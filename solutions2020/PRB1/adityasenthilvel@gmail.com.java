// Aditya Senthilvel
// PRB1 Multiplying Numbers

import java.util.Scanner;
class PRB1 {



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        long[] sums = new long[n];

        for (int i = 0; i < n; i++) {
            int x = keyboard.nextInt();
            int y = keyboard.nextInt();
            long z = ((long)x) * y;
            sums[i] = z;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sums[i]);
        }





    }

}
