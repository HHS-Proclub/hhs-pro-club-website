import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class PRA3_1 {

    public static Integer merge(int k, List<Integer> a) {

        if (a.size() == 1) return 0;
        if (a.size() == 2) return k;
        Integer cost = 0;

        while (a.size() > 1) {
            Collections.sort(a);
            cost += a.get(0) + a.get(1);
            a.add(a.get(0) + a.get(1));
            a.remove(0);
            a.remove(0);
        }
        return cost;
    }

    public static void main(String[] argv) {

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        Integer[] energy = new Integer[n];
        for (int y = 0; y < n; y++) {
            int k = x.nextInt();
            int i = x.nextInt();
            
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                a.add(new Integer(x.nextInt()));
            }
            energy[y] = merge(k, a);
        }
        for (int y = 0; y < n; y++){
            System.out.println(energy[y]);
        }
    }
}