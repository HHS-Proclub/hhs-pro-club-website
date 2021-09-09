import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA12 {
    public static void main(String[] args) {
        PRA12 p = new PRA12();
        Scanner in = new Scanner(System.in);
        List<String> outputs = new ArrayList<>();
        String cases = in.nextLine();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String s = in.nextLine();
            outputs.add(p.stringPossible(s));

        }
        for (String str : outputs) {
            System.out.println(str);
        }
        in.close();
    }
    public String stringPossible(String s) {
        int i = 0;

        while (s.length() > 0 && (i < s.length() - 1)) {
            if (s.charAt(i) == s.charAt(i+1)) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(i+2);
                s = s1 + s2;
                i = 0;

            } else {
                i++;
            }
        }

        if (s.length() == 0) {
            return "Possible";

        } else {
            return "Impossible";
        }
    }
}
