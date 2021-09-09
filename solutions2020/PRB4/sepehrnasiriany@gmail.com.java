import java.util.Scanner;

public class PRB4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();

        int num = i;

        System.out.println(i);

        for (int k = 1; k < j; k++) {
            num += i;

            System.out.println(num);
        }
    }
}
