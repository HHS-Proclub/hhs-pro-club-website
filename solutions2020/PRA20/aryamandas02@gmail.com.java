import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PRA20 p = new PRA20();

        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.subsets2(str));
        }

        for (int j : outputs) {
            System.out.println(j);
        }

        in.close();
    }

    public char[] decimalToBinary(int number, int size) {

        char[] array = new char[size];

        Arrays.fill(array, '0');

        int pos = size - 1;

        while (number > 0) {
            int remainder = number % 2;
            array[pos--] = Character.forDigit(remainder, 10);
            number /= 2;

        }
        return array;
    }

    public int subsets2(String s) {

        String[] sArray = s.split(" ");

        List<Integer> array = new ArrayList<>();
        for (String str : sArray) {
            array.add(Integer.parseInt(str));
        }

        int count = 0;
        Set<String> elems = new LinkedHashSet<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            char[] elemArray = decimalToBinary(i, array.size());

            StringBuilder sb = new StringBuilder();

            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < elemArray.length; k++) {

                if (elemArray[k] == '1') {
                    list.add(array.get(k));
                    sb.append(array.get(k));
                }
            }

            Collections.sort(list);

            for (int val : list) {
                sb.append(String.format("%d.", val));
            }

            String str = sb.toString();

            if (!elems.contains(str)) {
                elems.add(str);

                if (isSumGreaterThenProduct(list)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSumGreaterThenProduct(List<Integer> list) {
        int sum = 0;
        int product = 1;

        for (int val : list) {
            product *= val;
            sum += val;
        }

        return (sum > product);
    }
}
