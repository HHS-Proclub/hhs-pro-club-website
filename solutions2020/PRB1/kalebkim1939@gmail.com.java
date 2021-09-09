import java.util.Scanner;
import java.lang.String;

class PRB1 {
    public static String prgm(String a) {
        String[] val = a.split(" ", 2);
        return Integer.toString(Integer.parseInt(val[0]) * Integer.parseInt(val[1]));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int problemCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < problemCount; i++) {
            System.out.println(prgm(scan.nextLine()));
        }
        scan.close();
    }
}