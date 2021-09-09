import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PROCO1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(compute(str));
        }
        for (String j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public static String decimalToBinary(int number, int size) {
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
    public static String compute(String str) {
        String[] sArray = str.split(" ");
        double budget = Double.parseDouble(str.substring(0, str.indexOf(":")));
        List<Double> array = new ArrayList<>();

        for (int i = 1; i < sArray.length; i++) {
            array.add(Double.parseDouble(sArray[i]));
        }
        Set<String> elems = new HashSet<>();
        double closetDiff = Double.MAX_VALUE;
        String output = "";

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            String binary = decimalToBinary(i, array.size());
            char[] elemArray = binary.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < elemArray.length; k++) {
                if (elemArray[k] == '1') {
                    sb.append(String.valueOf(array.get(k)) + ' ');
                }
            }
            elems.add(sb.toString());
        }
        for (String s : elems) {
            s = s.trim();
            String[] strArray = s.split(" ");
            double sum = 0;
            for (String t : strArray) {
                sum += Double.parseDouble(t);
            }
            double diff = Math.abs(budget - sum);
            if (sum <= budget && closetDiff > Math.abs(budget - sum)) {
                closetDiff = diff;
                output = s;
            }
        }
        return output;
    }
}
