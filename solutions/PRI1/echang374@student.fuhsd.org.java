import java.util.Scanner;

public class PRI1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        for(; i > 0; i--) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println(n1+n2);
        }
        s.close();
    }
}
