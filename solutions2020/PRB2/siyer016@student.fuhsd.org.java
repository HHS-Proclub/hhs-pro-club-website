import java.util.ArrayList;
import java.util.Scanner;

public class PRB2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        ArrayList<String> solutions = new ArrayList<>();

        for(int j = 0; j < i; j++) {
            int n = input.nextInt();
            int d = input.nextInt();
            int m = input.nextInt();

            for(int k = 0; k < m; k++) {
                int x = input.nextInt();
                int y = input.nextInt();
                if(y >= d - x && y <= 2 * n - d - x && y <= d + x && y >= x - d) solutions.add("YES");
                else solutions.add("NO");
            }
        }

        for(String s : solutions) System.out.println(s);
    }
}