import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA22 p = new PRA22();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String goodVal = in.nextLine();
            String str = in.nextLine();
            outputs.add(p.productSubsets(Integer.parseInt(goodVal), str));
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

    public int productSubsets(int goodValue, String s) {
        String[] sArray = s.split(" ");
        List<Integer> array = new ArrayList<>();

        for (String str : sArray) {
            array.add(Integer.parseInt(str));
        }
        int count = 0;
        //List<String> elems = new ArrayList<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            char[] elemArray = decimalToBinary(i, array.size());
            //StringBuilder sb = new StringBuilder();

            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < elemArray.length; k++) {
                if (elemArray[k] == '1') {
                    list.add(array.get(k));
                    //sb.append(array.get(k));
                }
            }
            //Collections.sort(list);

            // for (int val : list) {
            //   sb.append(String.format("%d.", val));
            //}
            //String str = sb.toString();
            //elems.add(str);

            if (isProductEqualGoodVal(list, goodValue)) {
                count++;
            }
        }
        return count;
    }
    private boolean isProductEqualGoodVal(List<Integer> list, int n) {
        int product = 1;

        for (int val : list) {
            product *= val;
        }

        return (product == n);
    }
}
