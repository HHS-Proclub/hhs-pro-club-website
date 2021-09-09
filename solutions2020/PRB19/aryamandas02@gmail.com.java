import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB19 p = new PRB19();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.candies(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }

    public int candies(String str) {
        String[] strArray = str.split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        int c = Integer.parseInt(strArray[2]);

        if (c <= 2) {
            return -1;
        }
        if (a <= 1 || b <= 1) {
            return -1;
        }
        if (a < b && b < c) {
            return 0;
        }
        int num1 = c - 1;
        int eat1 = b;
        int eat2 = a;

        if (b > num1) {
            for (eat1 = b; eat1 >= 1; eat1--) {
                if (eat1 == num1) {
                    break;
                }
            }
        }
        int num2 = eat1 - 1;

        if (a > num2) {
            for (eat2 = a; eat2 >= 1; eat2--) {
                if (eat2 == num2) {
                    break;
                }
            }
        }
        if (eat1 == 0) {
            return a - eat2;
        }
        if (eat2 == 0) {
            return b - eat1;
        }
        return (b - eat1) + (a - eat2);
    }
}
