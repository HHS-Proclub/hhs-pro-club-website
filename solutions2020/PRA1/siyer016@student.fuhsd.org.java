import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] solutions = new int[n];
        for(int i = 0; i < n; i++) {
            int a = input.nextInt();
            a++;
            while(!isDistinct(a)) {
                a++;
            }

            solutions[i] = a;
        }

        for(int i : solutions) System.out.println(i);
    }

    private static boolean isDistinct(int a) {
        String b = Integer.toString(a);
        ArrayList<Character> alreadyThere = new ArrayList<>();
        for(int j = 0; j < 4; j++) {
            char c = b.charAt(j);
            if(!alreadyThere.contains(c)) {
                alreadyThere.add(c);
            } else {
                return false;
            }
        }

        return true;
    }
}