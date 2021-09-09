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

        char[] sArray = s.toCharArray();

        int n = sArray.length;

        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < n/2; i++) {

            sb.append(sArray[i]);

        }

        return sb.toString();

    }

}