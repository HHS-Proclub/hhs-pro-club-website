import java.util.Scanner;

public class PRB1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            int M = input.nextInt();
            int N = input.nextInt();
            System.out.println(M*N);
        }

        input.close();
    }
}