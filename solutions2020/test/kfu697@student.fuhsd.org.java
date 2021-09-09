import java.util.*;

public class test {
    public static void main(String[] args) {
        // Input parsing
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] skillLevels = new int[N];
        for (int i = 0; i < N; i++) {
            skillLevels[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) sum += skillLevels[i];

        // Try excluding each person
        for (int i = 0; i < N; i++) {
            System.out.println(sum - skillLevels[i]);
        }
    }
}