import java.util.Scanner;

public class R1A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int minLength = Integer.MAX_VALUE;
        int i = 0;
        int j = i;
        int count = 0;

        while (i <= array.length - 2 && j <= array.length - 1) {
            if (array[j] == 1 && count < k) {
                count++;
            }
            j++;
            if (count == k) {
                if ((j - i + 1) < minLength) {
                    minLength = (j - i + 1);
                }
                if ((j - i + 1) == k) {
                    System.out.println((j - i + 1));
                    break;
                }
                count = 0;
                i++;
                j = i;
            }
        }
        System.out.println(minLength-1);
        in.close();
    }
}
