import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA23 p = new PRA23();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.sortingSubsets(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int sortingSubsets(String str) {
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];

        for (int j = 0; j < strArray.length; j++) {
            array[j] = Integer.parseInt(strArray[j]);
        }
        int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        Arrays.sort(array2);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                count++;
            }
        }
        return count;
    }
}
