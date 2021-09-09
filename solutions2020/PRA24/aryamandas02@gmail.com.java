import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA24 p = new PRA24();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.turnsSequence(str));
        }
        for (long j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int turnsSequence(String str) {
        String[] strArray = str.split(" ");
        int x = Integer.parseInt(strArray[0]);
        int y = Integer.parseInt(strArray[1]);
        int sum = x + y;

        double val = (-1 + Math.sqrt(1 + 8*sum)) / 2.0;
        int n = (int) val;

        if (val != n) {
            return -1;
        } else {
            int c = (2*sum - 2*x);
            int a1 = (int) ((1 + Math.sqrt(1 + 4*c)) / 2.0);
            return n - a1 + 1;
        }
    }
}
