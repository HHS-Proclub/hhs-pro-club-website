import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = Integer.parseInt(in.nextLine());
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String n = in.nextLine();
            outputs.add(countNums(n));
        }
        for (String o : outputs) {
            System.out.println(o);
        }

        in.close();
    }

    public static String countNums(String n) {
        if (n.equals("0")) {
            return n;
        }
        char[] array = n.toCharArray();

        Set<Integer> chars = new HashSet<>();

        for (char c : array) {
            chars.add(Character.getNumericValue(c));
        }
        if (chars.size() == 1) {
            return n + array[0];
        }
        
        int traverseIndex = -1;
        for (int j = array.length-1; j >=0; j--) {
            int elem = Character.getNumericValue(array[j]);

            boolean found = false;
            for (int in = elem+1; in <= 9; in++) {
                if (chars.contains(in)) {
                    array[j] = Character.forDigit(in,  10);
                    found = true;
                    break;
                }
            }
            
            if (found) {
                traverseIndex = j+1;
                break;
            }
        }
        
        for (int i = traverseIndex; i < array.length; i++) {
            
            int elem = Character.getNumericValue(array[i]);
            
            for (int in = elem-1; in >= 0; in--) {
                if (chars.contains(in)) {
                    array[i] = Character.forDigit(in,  10);
                }
            }
        }
        
        return new String(array);
    }
}
