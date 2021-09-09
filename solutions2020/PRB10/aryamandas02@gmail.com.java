import java.util.Scanner;


public class PRB10 {
    public static void main(String[] args) {
        PRB10 p = new PRB10();
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println(p.fraction(s));

        in.close();
    }
    public String fraction(String s) {
        String[] sArray = s.split("/");
        int a = Integer.parseInt(sArray[0]);
        int b = Integer.parseInt(sArray[1]);

        int gcf = gcf(a, b);

        return (a / gcf) + "/" + (b / gcf);
    }
    private int gcf(int a, int b) {
        int global = Integer.MIN_VALUE;

        for (int i = 1; i <= a; i++) {
            if ((a % i == 0 && b % i == 0) && (i > global)) {
                global = i;
            }
        }
        return global;
    }
}
