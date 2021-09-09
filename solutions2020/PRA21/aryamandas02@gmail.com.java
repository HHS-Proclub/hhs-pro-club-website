import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRA21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA21 p = new PRA21();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.zoo(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int zoo(String str) {
        String[] strArray = str.split(" ");
        List<Integer> array = new ArrayList<>();

        for (String s : strArray) {
            array.add(Integer.parseInt(s));
        }
        List<String> binaries = new ArrayList<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            binaries.add(decimalToBinary(i, array.size()));
        }
        StringBuilder zeroes = new StringBuilder();
        for (int i = 1; i <= array.size(); i++) {
            zeroes.append("0");
        }
        binaries.add(zeroes.toString());
        int configCount = 0;

        for (String c : binaries) {
            //System.out.println(c);
            List<Integer> rVals = new ArrayList<>();
            List<Integer> cVals = new ArrayList<>();

            for (int in = 0; in < c.length(); in++) {
                if (c.charAt(in) == '0') {
                    rVals.add(array.get(in));
                } else if (c.charAt(in) == '1') {
                    cVals.add(array.get(in));
                }
            }
            Collections.sort(rVals);
            Collections.sort(cVals);

            if (rVals.size() > 0 && cVals.size() > 0) {
                if (isConsecutive(rVals) && isConsecutive(cVals)) {
                    configCount++;
                }
            } else if (rVals.size() > 0) {
                if (isConsecutive(rVals)) {
                    configCount++;
                }
            } else {
                if (isConsecutive(cVals)) {
                    configCount++;
                }
            }
        }
        return configCount;
    }
    private String decimalToBinary(int number, int size) {
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

    private boolean isConsecutive(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                return false;
            }
        }
        return true;
    }
}
