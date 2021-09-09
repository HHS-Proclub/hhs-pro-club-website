import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PRB5 {
    public static void main(String[] args) {
        PRB5 p = new PRB5();
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();

        System.out.println(p.sumOfMultiples(a, b));

        in.close();
    }

    public int sumOfMultiples(String a, String b) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        if (b == null || b.isEmpty()) {
            return -1;
        }
        if (a == null || a.isEmpty()) {
            return -1;
        }
        String[] aArray = a.split(" ");
        String[] bArray = b.split(" ");

        for (String i : aArray) {
            aList.add(Integer.valueOf(i));

        }
        for (String j : bArray) {
            bList.add(Integer.valueOf(j));
        }
        int aLargest = 0;
        int bLargest = 0;

        for (int i = 0; i < aList.size(); i++) {
            if (numContainZero(aList.get(i)) == true && aList.get(i) > aLargest) {
                aLargest = aList.get(i);
            }
        }

        for (int j = 0; j < bList.size(); j++) {
            if (numContainZero(bList.get(j)) == true && bList.get(j) > bLargest) {
                bLargest = bList.get(j);
            }
        }

        return aLargest + bLargest;
    }
    public boolean numContainZero(int number) {
        String num = String.valueOf(number);
        char[] numArray = num.toCharArray();
        char j = Integer.toString(0).charAt(0);
        if (numArray[numArray.length-1] == j) {
            return true;
        }
        return false;
    }
}
