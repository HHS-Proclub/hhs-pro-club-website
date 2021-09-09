import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA16 {

    private static final List<Character> suits = Arrays.asList('C', 'D', 'H', 'S');

    private static final List<Character> values = Arrays.asList('2', '3', '4', '5',
            '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A');

    public static void main(String[] args) {
        PRA16 p = new PRA16();
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        int casesCount = Integer.parseInt(cases);
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < casesCount; i++) {
            String str = in.nextLine();
            outputs.add(p.bridgeSort(str));
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }

    public String bridgeSort(String s) {
        s = s.replaceAll(" ",  "");
        if (s.length() % 2 != 0) {
            return "";
        }
        if (s.length() < 2 || s.length() > 26) {
            return "";
        }

        s = s.toUpperCase();

        char[] sarray = s.toCharArray();
        for (int i = 0; i < sarray.length; i++) {

            if (i%2 == 0) {
                if (!suits.contains(sarray[i])) {
                    return "";
                }
            } else {
                if (!values.contains(sarray[i])) {
                    return "";
                }
            }

            if (sarray[i] == 'T') {
                sarray[i] = 'V';
            }
            if (sarray[i] == 'J') {
                sarray[i] = 'W';
            }
            if (sarray[i] == 'Q') {
                sarray[i] = 'X';
            }
            if (sarray[i] == 'K') {
                sarray[i] = 'Y';
            }
            if (sarray[i] == 'A') {
                sarray[i] = 'Z';
            }
        }

        s = new String(sarray);
        List<String> cards = new ArrayList<>();

        for (int j = 0; j < s.length(); j += 2) {
            cards.add(s.substring(j, j + 2));

        }
        String[] array = cards.toArray(new String[cards.size()]);

        /*
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }*/

        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();

        for (String str : array) {
            sb.append(str);
        }
        String str = sb.toString();
        char[] strarray = str.toCharArray();

        for (int i = 0; i < strarray.length; i++) {
            if (strarray[i] == 'V') {
                strarray[i] = 'T';
            }
            if (strarray[i] == 'W') {
                strarray[i] = 'J';
            }
            if (strarray[i] == 'X') {
                strarray[i] = 'Q';
            }
            if (strarray[i] == 'Y') {
                strarray[i] = 'K';
            }
            if (strarray[i] == 'Z') {
                strarray[i] = 'A';
            }
        }
        return new String(strarray);
    }
}
