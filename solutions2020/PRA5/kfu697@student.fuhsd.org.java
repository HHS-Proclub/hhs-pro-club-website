/*
Source: "Mike and strings" from Codeforces Round #410 (Div. 2)

Solution: I think there's an O(S^2) solution for this, but I don't wanna code it. So,
this is an O(S^3) solution. Hopefully it passes...?

For each string, try all possible starting positions. Record which ones work. After
doing that, try all possible meeting points, and see which one requires the minimum
number of moves.

Runtime: O(S^3)
*/

import java.util.*;
import java.io.*;

public class PRA5 {
    int N, strLen, S;
    String initialStr;
    String[] strings;
    boolean[][] startLocs;

    PRA5(InputReader in, PrintWriter out) throws IOException {
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            solve(in, out);
        }
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        S = in.nextInt();
        initialStr = in.next();
        strLen = initialStr.length();
        startLocs = new boolean[S][strLen];
        strings = new String[S];
        strings[0] = initialStr;

        // Find initial string's start locs
        boolean impossible = false;
        for (int i = 0; i < strLen; i++) checkStart(0, i);
        for (int i = 1; i < S; i++) {
            strings[i] = in.next();
            if (strLen != strings[i].length()) impossible = true;
            else {
                for (int j = 0; j < strLen; j++) checkStart(i, j);

                // Impossible?
                boolean valid = false;
                for (int j = 0; j < strLen; j++) {
                    if (startLocs[i][j]) {
                        valid = true;
                        break;
                    }
                }
                if (!valid) impossible = true;
            }
        }
        // for (int i = 0; i < S; i++) System.out.println(Arrays.toString(startLocs[i]));

        if (impossible) {
            out.println(-1);
            return;
        }

        // Try every meet location (relative to initial string)
        int minMoves = 987654321;
        for (int i = 0; i < strLen; i++) {
            minMoves = Math.min(meetAt(i), minMoves);
        }
        out.println(minMoves);
        // out.flush();
    }

    int meetAt(int meetLoc) {
        int totalMoves = 0;
        for (int i = 0; i < S; i++) {
            int minMoves = 987654321;
            for (int j = 0; j < strLen; j++) {
                if (startLocs[i][j]) {
                    minMoves = Math.min(requiredMoves(j, meetLoc), minMoves);
                }
            }
            totalMoves += minMoves;
        }
        return totalMoves;
    }

    int requiredMoves(int a, int b) {
        if (a >= b) {
            // Moving left is enough
            return a - b;
        } else {
            // Must loop around
            return a + strLen - b;
        }
    }

    void checkStart(int strI, int startI) {
        String str = strings[strI];
        for (int i = 0, j = startI; i < strLen; i++, j = (j+1) % strLen) {
            if (initialStr.charAt(i) != str.charAt(j)) return;  // Not valid starting loc
        }
        // Valid loc
        startLocs[strI][startI] = true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        new PRA5(new InputReader(in), out);
        in.close();
        out.close();
    }
}

class InputReader {
    BufferedReader in;
    StringTokenizer st;

    InputReader(BufferedReader in) throws IOException {
        this.in = in;
        st = new StringTokenizer("");
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    String next() throws IOException {
        while (!st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
        return st.nextToken();
    }

    String nextLine() throws IOException {
        return in.readLine();
    }
}
