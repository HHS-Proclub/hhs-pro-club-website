/*
Solution: Track the # of different letters in the string. The answer is C - # different.
If C > the length of the string, then it's impossible.
Runtime: O(|S|)
*/

import java.util.*;
import java.io.*;

public class PRB5 {
    int N;

    PRB5(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            boolean[] used = new boolean[26];
            char[] S = in.readLine().toCharArray();
            int C = Integer.parseInt(in.readLine());
            int numDiff = 0;
            for (char c : S) {
                if (!used[c - 'a']) {
                    used[c - 'a'] = true;
                    numDiff++;
                }
            }
            if (C > S.length) out.println("impossible");
            else out.println(Math.max(0, C - numDiff));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        new PRB5(in, out);
        in.close();
        out.close();
    }
}
