import java.util.Scanner;

public class PRB13 {
    public static void main(String[] args) {
        PRB13 p = new PRB13();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(p.maxSum(input));

        in.close();
    }
    public int maxSum(String input) {
        String[] inputArray = input.split(" ");
        int k1 = Integer.parseInt(inputArray[0]);
        int k2 = Integer.parseInt(inputArray[1]);
        int k4 = Integer.parseInt(inputArray[3]);

        if (k1 == 0 || k2 == 0) {
            return 0;

        }

        int sum = 0;
        int min = Math.min(k1, Math.min(k2, k4));

        sum += min * 142;

        k1 -= min;
        k2 -= min;

        min = Math.min(k1,  k2);

        sum += min * 12;
        return sum;
    }
}
