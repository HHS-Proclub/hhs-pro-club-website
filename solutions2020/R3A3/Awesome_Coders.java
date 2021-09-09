import java.util.Scanner;

public class R3A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String str = num.substring(num.indexOf(".") + 1, num.length());
        int n = Integer.parseInt(str);
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            n /= 10;
            sum += r;
        }
        String s = "";

        if (num.charAt(0) == '-') {
            s = num.substring(1, num.indexOf("."));
        } else {
            s = num.substring(0, num.indexOf("."));
        }
        int number = Integer.parseInt(s);

        while (number > 0) {
            int r = number % 10;
            number /= 10;
            sum += r;
        }
        System.out.println(sum);
    }
}
