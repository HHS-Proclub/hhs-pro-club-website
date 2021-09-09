/*
Solution: A = Max # suits of the 1st type. min(B, C) = Max # suits of the 2nd type.
Whichever one costs more is the one you should make first. Remember to limit based on
the value of D!
Runtime: O(1)
*/

import java.util.*;
import java.io.*;

public class PRB6 {
    int N, A, B, C, D, E, F;

    PRB6(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            A = Integer.parseInt(in.readLine());
            B = Integer.parseInt(in.readLine());
            C = Integer.parseInt(in.readLine());
            D = Integer.parseInt(in.readLine());
            E = Integer.parseInt(in.readLine());
            F = Integer.parseInt(in.readLine());

            int max1 = A;
            int max2 = Math.min(B, C);
            int cost = 0;
            if (E > F) {
                // First type first
                if (D < max1) {
                    out.println(E * D);
                } else {
                    cost += E * max1;
                    D -= max1;
                    cost += Math.min(max2, D) * F;
                    out.println(cost);
                }
            } else {
                // Second type first
                if (D < max2) {
                    out.println(F * D);
                } else {
                    cost += F * max2;
                    D -= max2;
                    cost += Math.min(max1, D) * E;
                    out.println(cost);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // BufferedReader in = new BufferedReader(new FileReader("PRB6.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("PRB6.out")));
        new PRB6(in, out);
        in.close();
        out.close();
    }
}
