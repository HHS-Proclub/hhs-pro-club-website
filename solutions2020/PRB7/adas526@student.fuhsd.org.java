import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String length = in.nextLine();
        int n = Integer.parseInt(length);
        String s = in.nextLine();
        String val = in.nextLine();
        int i = Integer.parseInt(val);
        int iCount = 0;
        String[] array = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String j : array) {
            list.add(Integer.parseInt(j));
        }
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) == i) {
                iCount++;
            }
        }
        int probability = (int)(100 * iCount * 1.0 / n);
        System.out.println(probability);
        in.close();
    }
}
