import java.util.Scanner;

public class HPI2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numOfLockers = (int) Math.sqrt(n);
        System.out.println(numOfLockers);
        in.close();
    }
}
