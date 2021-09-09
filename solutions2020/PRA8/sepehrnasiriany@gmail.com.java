import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class PRA8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        PRA8 p = new PRA8();


        int cases = in.nextInt();

        List<Integer> outputs = new ArrayList<>();


        for (int i = 0; i < cases; i++) {

            int n = in.nextInt();

            outputs.add(p.fibbonaciGame(n));

        }

        for (int j : outputs) {

            System.out.println(j);

        }

        in.close();

    }


    public int fibbonaciGame(int n) {

        int num1 = 0;

        int num2 = 1;

        int num3 = 0;

        List<Integer> vals = new ArrayList<>();


        while (num3 <= n) {

            num3 = num2 + num1;

            vals.add(num3);

            num1 = num2;

            num2 = num3;

        }

        return Math.min(Math.abs(vals.get(vals.size() - 1) - n),

                Math.abs(vals.get(vals.size() - 2) - n));

    }

}