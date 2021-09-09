import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class PRA3_1 {

//    public static int minCost(int k, int[] a, int start, int end) {
//        if (end - start + 1 == 1) return 0;
//        else if (end - start + 1 == 2) return k;
//
//        int len = 0;
//        int cost = -1;
//        for (int i = start; i < end; i++) {
//            len += a[i];
//            //if (len < k/2) continue;
//            int myCost = k + minCost(len, a, start, i) + minCost(k - len, a,i + 1, end);
//            if (cost < 0) cost = myCost;
//            else if (cost > myCost) cost = myCost;
//        }
//        return cost;
//    }

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

//    public static int minCost(int k, int[] a, int start, int end) {
//        if (end - start + 1 == 1) return 0;
//        else if (end - start + 1 == 2) return k;
//
//        int minDiff = -1;
//        int minI = 0;
//        int minLeft = 0;
//
//        int len = 0;
//        for (int i = start; i < end; i++) {
//            len += a[i];
//            int diff = Math.abs(k - len - len);
//            if (i == start || minDiff > diff) {
//                minDiff = diff;
//                minI = i;
//                minLeft = len;
//            }
//         }
//
//        return k + minCost(minLeft, a, start, minI) + minCost(k-minLeft, a, minI + 1, end);
//    }

    public static void main(String[] argv) {

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        Integer[] energy = new Integer[n];
        for (int y = 0; y < n; y++) {
            int k = x.nextInt();
            int i = x.nextInt();

//            int[] a = new int[i];
            List<Integer> a = new ArrayList<>();
//            int sum = 0;
            for (int j = 0; j < i; j++) {
                a.add(new Integer(x.nextInt()));

//                sum += desiredLengths[a];
            }
//            if (sum != k) {
//                return;
//            }
//            Arrays.sort(a);
//            if (a[0] == a[i-1]) {
//                for (int z = 0; z < i; z++) {
//                    energy[y] += k;
//                    k -= a[i/2];
//                }
//            }
//            energy[y] = 0;
//            for (int z = i - 1; z > 0; z--) {
//                energy[y] += k;
//                k -= a[z];
//            }

            //energy[y] = minCost(k, a, 0, i - 1);
            energy[y] = merge(k, a);
        }
        for (int y = 0; y < n; y++){
            System.out.println(energy[y]);
        }
    }
}
