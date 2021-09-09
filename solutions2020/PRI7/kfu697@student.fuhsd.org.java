/*
Solution: If there was only 1 tree, then one of the groups must contain only 1 person (the
boss of the entire tree). Then, the 2nd group should contain all of the boss's children to
maximize the # of people in each group. Multiple trees are independent from each other, so
by this greedy approach, the answer to the problem is just the maximum depth of any node.

Runtime: O(W)

Source: Codeforces Beta Round #87 (Div. 1) A
 */

import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class PRI7 {
    int W, answer;
    boolean[] isBoss;
    ArrayList<Integer>[] children;

    PRI7(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        W = Integer.parseInt(st.nextToken());
        children = new ArrayList[W];
        isBoss = new boolean[W];
        for (int i = 0; i < W; i++) children[i] = new ArrayList<>(2);
        for (int i = 0; i < W; i++) {
            int c = Integer.parseInt(in.readLine()) - 1;
            if (c != -2) children[c].add(i);
            else isBoss[i] = true;
        }

        // DFS from each boss
        answer = 0;
        for (int i = 0; i < W; i++) {
            if (isBoss[i]) dfs(i, 1);
        }
        out.println(answer);
    }

    void dfs(int n, int d) {
        answer = Math.max(d, answer);
        for (int e : children[n]) dfs(e, d+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) new PRI7(in, out);
        in.close();
        out.close();
    }
}
