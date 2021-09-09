/*
Solution: 2 ways to solve this one. Cheesy way = Use regex that's implemented in Java.
The actual way is to do a prefix and suffix check before and after the wildcard (*). If
those pass, then the answer is YES; else it's NO.
Runtime: O(A + B)
*/

import java.util.*;
import java.io.*;

public class PRI5 {
    int N;

    PRI5(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            String strA = in.readLine();
            String strB = in.readLine();
            int starLoc = strA.indexOf('*');
            boolean valid = true;
            if (A - 1 > B) valid = false;
            else {
                // Prefix
                for (int j = 0; j < starLoc; j++) {
                    if (strA.charAt(j) != strB.charAt(j)) {
                        valid = false;
                        break;
                    }
                }
                // Suffix
                for (int j = 0; j < A - 1 - starLoc; j++) {
                    if (strA.charAt(A - 1 - j) != strB.charAt(B - 1 - j)) {
                        valid = false;
                        break;
                    }
                }
            }
            out.println(valid ? "YES" : "NO");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // BufferedReader in = new BufferedReader(new FileReader("PRI5.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("PRI5.out")));
        new PRI5(in, out);
        in.close();
        out.close();
    }
}
