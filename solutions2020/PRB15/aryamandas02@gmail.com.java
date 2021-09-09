import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> guess = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();

        int q = in.nextInt();
        int g = in.nextInt();
        int a = in.nextInt();
        int count = 0;

        for (int i = 1; i <= g; i++) {
            guess.add(1);
        }
        for (int i = 1; i <= (q-g); i++) {
            guess.add(0);
        }
        for (int i = 1; i <= a; i++) {
            actual.add(1);
        }
        for (int i = 1; i <= (q-a); i++) {
            actual.add(0);
        }
        for (int j = 0; j < actual.size(); j++) {
            if (actual.get(j) == guess.get(j)) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
