import java.util.Scanner;

public class PRB1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] solutions = new int[n];
        for(int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            solutions[i] = a + b;
        }

        for(int i : solutions) System.out.println(i);
    }
}