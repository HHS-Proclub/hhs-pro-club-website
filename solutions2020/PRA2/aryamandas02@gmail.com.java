import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int x = Integer.parseInt(in.nextLine());
            List<String> outputs = new ArrayList<>();

            for (int i = 0; i < x; i++) {
                int len = Integer.parseInt(in.nextLine());
                if (len == 0) {
                    outputs.add("YES");
                    continue;
                }
                int[] a1 = new int[len];
                int[] a2 = new int[len];

                String input = in.nextLine();
                String[] inputStr = input.split(" ");
                for (int j = 0; j < len; j++) {
                    a1[j] = Integer.parseInt(inputStr[j]);
                }

                String output = in.nextLine();
                String[] outputStr = output.split(" ");
                for (int k = 0; k < len; k++) {
                    a2[k] = Integer.parseInt(outputStr[k]);
                }
                outputs.add(trinkets(a1, a2));
            }
            for (String str : outputs) {
                System.out.println(str);
            }
        }
    }

    public static String trinkets(int[] a1, int[] a2) {

        int numZerosA1 = 0;
        int numZerosA2 = 0;
        for (int i : a1) {
            if (i == 0)
                numZerosA1++;
        }
        for (int i : a2) {
            if (i == 0)
                numZerosA2++;
        }

        if (numZerosA1 == 0 || numZerosA2 == 0) {
            return "NO";
        }

        if (numZerosA1 != numZerosA2) {
            return "NO";
        }

        List<Integer> aorig = new ArrayList<>();
        List<Integer> atarget = new ArrayList<>();

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != 0) {
                aorig.add(a1[i]);
            }
        }
        for (int j = 0; j < a2.length; j++) {
            if (a2[j] != 0) {
                atarget.add(a2[j]);
            }
        }
        int firstElem = atarget.get(0);
        int anchorIndex = 0;
        int targetIndex = 0;

        for (int k = 0; k < aorig.size(); k++) {
            if (aorig.get(k) == firstElem) {
                anchorIndex = k;
                break;
            }
        }

        for (int iter = 0; iter < aorig.size(); iter++) {
            if (aorig.get(anchorIndex) != atarget.get(targetIndex)) {
                return "NO";
            }

            anchorIndex = (anchorIndex + 1) % aorig.size();
            targetIndex = (targetIndex + 1) % aorig.size();
        }

        return "YES";
    }
}
