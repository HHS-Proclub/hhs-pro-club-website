import java.util.Scanner;

public class PRI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Loops
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(addNumbers(N, M));
        }
    }

    static int addNumbers(int i, int j){
        return i+j;
    }
}