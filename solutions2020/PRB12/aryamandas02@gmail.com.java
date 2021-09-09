import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PRB12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB12 p = new PRB12();

        String cases = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String s = in.nextLine();
            outputs.add(p.printString(s));
        }
        for (String str : outputs) {
            System.out.println(str);
        }
        in.close();
    }
    public String printString(String s) {
        if (s.length() % 2 != 0) {
            return null;
        }
        String reverseString = new StringBuffer(s).reverse().toString();

        return new StringBuffer(reverseString.substring(reverseString.length() / 2)).reverse().toString();
    }
}
