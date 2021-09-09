import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HPI8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bag = in.nextLine();
        String[] vals = bag.split(" ");
        long weight = Long.parseLong(vals[0]);
        int binders = Integer.parseInt(vals[1]);
        List<Long> weights = new ArrayList<>();
        List<Long> benefits = new ArrayList<>();

        for (int i = 0; i < binders; i++) {
            String binder = in.nextLine();
            String[] binderArray = binder.split(" ");
            weights.add(Long.parseLong(binderArray[0]));
            benefits.add(Long.parseLong(binderArray[1]));
        }
        List<String> binaries = new ArrayList<>();

        for (int i = 1; i < Math.pow(2, weights.size()); i++) {
            binaries.add(decimalToBinary(i, weights.size()));
        }
        long largestBenefit = 0;

        for (String str : binaries) {
            long weightSum = 0;
            long benefitSum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    weightSum += weights.get(j);
                    benefitSum += benefits.get(j);
                }
            }
            if (weightSum <= weight && benefitSum > largestBenefit) {
                largestBenefit = benefitSum;
            }
        }
        System.out.println(largestBenefit);
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
}
