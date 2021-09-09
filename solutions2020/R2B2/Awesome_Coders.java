import java.util.Scanner;

public class R2B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        for (int i = 1; i < num; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String str = sb.reverse().toString();
            if (str.equals(String.valueOf(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
