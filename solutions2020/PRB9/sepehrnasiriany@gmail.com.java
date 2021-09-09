import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB9 p = new PRB9();
        String n = in.nextLine();
        List<String> results = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = in.nextLine();
            String newString = p.versionString(s);
            results.add(newString);
        }
        for (String s : results) {
            System.out.println(s);
        }
        in.close();
    }

    public String versionString(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        char[] sArray = s.toCharArray();

        if (sArray[0] != 'a' && sArray[1] != 'b') {
            return s.substring(2);

        } else if (sArray[0] != 'a') {
            return s.substring(1);

        } else if (sArray[1] != 'b') {
            String ch = String.valueOf(sArray[0]);
            return ch + s.substring(2);

        } else {
            return s;
        }
    }
}
