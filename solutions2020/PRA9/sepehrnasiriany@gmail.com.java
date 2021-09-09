import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA9 {
    public static void main2(String[] args) {
        PRA9 p = new PRA9();
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = in.nextLine();
            int val = p.xylophone(s);
            results.add(val);
        }
        for (int k : results) {
            System.out.println(k);
        }
        in.close();
    }

    public int xylophone(String s) {
        String[] sArray = s.split(" ");
        List<Integer> vals = new ArrayList<>();

        for (String i : sArray) {
            vals.add(Integer.parseInt(i));
        }
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 0; i < vals.size(); i++) {
            if (vals.get(i) % 7 == 0) {
                count++;
            } else if (vals.get(i) % 7 == 1) {
                count2++;
            } else if (vals.get(i) % 7 == 2) {
                count3++;
            } else if (vals.get(i) % 7 == 3) {
                count4++;
            } else if (vals.get(i) % 7 == 4) {
                count5++;
            } else if (vals.get(i) % 7 == 5) {
                count6++;
            } else if (vals.get(i) % 7 == 6) {
                count7++;
            }
        }
        List<Integer> counts = new ArrayList<>();
        counts.add(count);
        counts.add(count2);
        counts.add(count3);
        counts.add(count4);
        counts.add(count5);
        counts.add(count6);
        counts.add(count7);

        int globalCount = 0;

        for (int j : counts) {
            if (j != 0) {
                globalCount++;
            }
        }
        return globalCount;
    }

    public int xylophone2(String s) {
        String[] sArray = s.split(" ");
        List<Integer> vals = new ArrayList<>();

        for (String i : sArray) {
            vals.add(Integer.parseInt(i));
        }

        Set<Integer> output = new HashSet<>();

        for (int val : vals) {
            output.add(val % 7);
        }

        return output.size();
    }

    public static void main(String[] args) {
        PRA9 p = new PRA9();
        List<Integer> results = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = in.nextLine();
            int val = p.xylophone2(s);
            results.add(val);
        }
        for (int k : results) {
            System.out.println(k);
        }
        in.close();
    }
}
