import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB18 {
    public static void main(String[] args) {
        PRB18 p = new PRB18();
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.squareFreeString(str));
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }
    public String squareFreeString(String s) {
        List<String> subs = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= s.length() - i; j++) {
                String sub = s.substring(i, i+j);
                subs.add(sub);
            }
        }
        for (String str : subs) {
            if (isSquare(str)) {
                return "not square-free";
            }
        }
        return "square-free";
    }
    public boolean isSquare(String s) {
        if (s.length() % 2 != 0) {
            return false;
        } else {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2, s.length());

            if (s1.equals(s2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
