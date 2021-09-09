/*
Solution: Since the mall is a rooted tree, you can do a DFS down each path from the root to
figure out the # of consecutive danger zones Paul must go through to get to each node.
Then, just sum up the # of nodes that can still be visited with that constraint.

Runtime: O(S)

Source: Codeforces Round #321 (Div. 2) C
 */

import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class PRB7 {
    int S, M, answer;
    boolean[] isDanger;
    ArrayList<Integer>[] adj;

    PRB7(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isDanger = new boolean[S];
        adj = new ArrayList[S];
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < S; i++) {
            isDanger[i] = Integer.parseInt(st.nextToken()) == 1;
            adj[i] = new ArrayList<>(2);
        }
        int a, b;
        for (int i = 1; i < S; i++) {
            st = new StringTokenizer(in.readLine());
            a = Integer.parseInt(st.nextToken()) - 1;
            b = Integer.parseInt(st.nextToken()) - 1;
            adj[a].add(b);
            adj[b].add(a);
        }

        answer = 0;
        dfs(0, -1, 0);
        out.println(answer);
    }

    void dfs(int n, int p, int dangerCount) {
        if (isDanger[n]) dangerCount++;
        else dangerCount = 0;  // Not consecutive
        if (dangerCount > M) return;  // Stop here (too many consecutive)
        if (n != 0 && adj[n].size() == 1) answer++;  // Leaf reached
        else for (int e : adj[n]) {
            if (e != p) dfs(e, n, dangerCount);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) new PRB7(in, out);
        in.close();
        out.close();
    }
}
