import java.util.Scanner;

public class PRB23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i+1));
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
}
