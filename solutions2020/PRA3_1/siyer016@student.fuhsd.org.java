import java.util.ArrayList;
import java.util.Scanner;

public class PRA3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] solutions = new int[n];

        for(int j = 0; j < n; j++) {
            int k = input.nextInt();
            int i = input.nextInt();
            int b = 0;
            ArrayList<Integer> lengths = new ArrayList<>();

            for(int l = 0; l < i; l++) {
                lengths.add(input.nextInt());
            }

            while(lengths.size() > 1) {
                b += k;
                k -= max(lengths);
                lengths.remove(lengths.indexOf(max(lengths)));
            }

            solutions[j] = b;
        }

        for(int i : solutions) System.out.println(i);
    }

    public static int max(ArrayList<Integer> a) {
        int max = a.get(0);

        for(int i : a) {
            if(i > max) max = i;
        }

        return max;
    }
}