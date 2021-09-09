import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA6 {
    public static void main(String[] args) {
        PRA6 p = new PRA6();
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int x = Integer.valueOf(n);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String s = in.nextLine();

            strings.add(s);
        }
        for (String s : strings) {
            System.out.println(p.isStringSaid(s));
        }
        in.close();
    }

    public String isStringSaid(String s) {
        if (s == null) {
            return null;
        }

        if (s.isEmpty()) {
            return "YES";
        }

        //s = s.replaceAll("\\s+", "");
        s = s.trim();

        while (s.length() > 0) {
            if (s.startsWith("pi")) {
                s = s.substring(2);

            } else if (s.startsWith("ka")) {
                s = s.substring(2);

            } else if (s.startsWith("chu")) {
                s = s.substring(3);

            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
