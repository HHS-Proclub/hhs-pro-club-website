import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRB20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PRB20 p = new PRB20();
        int n = in.nextInt(); // repeat count and subset size
        int k = in.nextInt(); // 0 thru k-1
        int v = in.nextInt();

        // System.out.println(p.modEquation(n, k, v));
        p.foobarouter(n, k, v);
        System.out.println(p.gCount);
        in.close();

    }

    public int gCount = 0;

    public char[] decimalToBinary(int number, int size, int subsetSize) {
        char[] array = new char[size];
        Arrays.fill(array, '0');
        int pos = size - 1;

        while (number > 0) {
            int remainder = number % 2;
            array[pos--] = Character.forDigit(remainder, 10);
            number /= 2;
        }

        int count = 0;
        for (char c : array) {
            if (c == '1') {
                count++;
            }
        }

        return (count == subsetSize) ? array : null;
    }

    public int modEquation(int n, int k, int v) {

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array.add(i);
            }
        }

        int count = 0;

        Set<String> elems = new LinkedHashSet<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {

            char[] elemArray = decimalToBinary(i, array.size(), n);

            if (elemArray != null) {
                List<Integer> list = new ArrayList<>();
                for (int in = 0; in < elemArray.length; in++) {

                    if (elemArray[in] == '1') {
                        list.add(array.get(in));
                    }
                }
                Collections.sort(list);

                StringBuilder sb = new StringBuilder();

                for (int val : list) {
                    sb.append(String.format("%d.", val));

                }
                String str = sb.toString();

                if (!elems.contains(str)) {

                    elems.add(str);
                    if (modCheck(list, k, v)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public void foobarouter(int n, int k, int v) {
        int[] array = new int[n];
        Arrays.fill(array, 0);

        foobar(n, k, v, array, 0);

    }

    private void foobar(int n, int k, int v, int[] array, int pos) {

        if (pos == n) {
            // System.out.println(Arrays.toString(array));
            if (modCheckArray(array, k, v)) {
                gCount++;
            }
            return;
        }

        for (int index = 0; index < k; index++) {
            array[pos] = index;
            foobar(n, k, v, array, pos + 1);
        }
    }

    private boolean modCheck(List<Integer> list, int k, int v) {
        int product = 1;

        for (int val : list) {
            product *= val;

        }
        return (product % k == v);
    }

    private boolean modCheckArray(int[] list, int k, int v) {
        int product = 1;

        for (int val : list) {
            product *= val;

        }
        return (product % k == v);
    }
}
