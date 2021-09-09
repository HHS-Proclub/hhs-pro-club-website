import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRB14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB14 p = new PRB14();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.sumsOfSeq(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int sumsOfSeq(String s) {
        String[] sArray = s.split(" ");
        List<Integer> array = new ArrayList<>();

        for (String str : sArray) {
            array.add(Integer.parseInt(str));
        }
        List<String> binaries = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            binaries.add(decimalToBinary(i, array.size()));
        }
        for (int i = 0; i < binaries.size(); i++) {
            char[] elemArray = binaries.get(i).toCharArray();
            int sum = 0;
            for (int j = 0; j < elemArray.length; j++) {
                if (elemArray[j] == '1') {
                    sum += array.get(j);
                }
            }
            sums.add(sum);
        }
        Collections.sort(sums);
        if (sums.get(0) > 1) {
            return sums.get(0) - 1;
        }

        for (int k = 1; k < sums.size(); k++) {
            if ((sums.get(k) - sums.get(k-1)) > 1) {
                return sums.get(k-1) + 1;
            }
        }
        return sums.get(sums.size() - 1) + 1;
    }
    public String decimalToBinary(int number, int size) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            sb.append(remainder);
        }

        int zerosToFill = size - sb.length();
        for (int i = 0; i < zerosToFill; i++) {
            sb.append(0);
        }
        sb.reverse();
        return sb.toString();
    }
}
