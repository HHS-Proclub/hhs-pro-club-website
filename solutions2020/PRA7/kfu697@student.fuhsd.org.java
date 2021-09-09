/*
 * Solution: Since the United States is apparently a tree, there is only 1 valid way to
 * invert the edges such that a capital is valid. Furthermore, if you move the capital
 * between 2 connected nodes, only that edge needs to be inversed. So, you can do an
 * initial DFS to find the # of inversed roads on 1 node, and then do another DFS to
 * find the # on all nodes by reversing the edge you're traversing.
 *
 * Runtime: O(C)
 *
 * Source: Codeforces Round #135 (Div. 2) D
 * Interesting that a Div2 D problem is placed after a Div1 A.
 */

import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class PRA7 {
    int C, answer;
    ArrayList<Edge>[] adj;

    PRA7(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        C = Integer.parseInt(st.nextToken());
        adj = new ArrayList[C];
        for (int i = 0; i < C; i++) adj[i] = new ArrayList<>(2);
        int a, b;
        for (int i = 1; i < C; i++) {
            st = new StringTokenizer(in.readLine());
            a = Integer.parseInt(st.nextToken()) - 1;
            b = Integer.parseInt(st.nextToken()) - 1;
            adj[a].add(new Edge(b, true));
            adj[b].add(new Edge(a, false));
        }

        initialInv = 0;
        initialDFS(0, -1);

        answer = 987654321;
        secondDFS(0, -1, initialInv);

        out.println(answer);
    }
    void secondDFS(int n, int p, int numInv) {
        if (numInv < answer) {
            answer = numInv;
        } else if (numInv == answer) {
        }
        for (Edge e : adj[n]) {
            if (e.n == p) continue;
            if (e.isThisWay) secondDFS(e.n, n, numInv + 1);  // Now need to flip edge
            else secondDFS(e.n, n, numInv - 1);  // No longer need to flip edge
        }
    }
    int initialInv;
    void initialDFS(int n, int p) {
        for (Edge e : adj[n]) {
            if (e.n == p) continue;
            if (!e.isThisWay) initialInv++;
            initialDFS(e.n, n);
        }
    }
    class Edge {
        int n;
        boolean isThisWay;
        Edge(int n, boolean isThisWay) {
            this.n = n;
            this.isThisWay = isThisWay;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) new PRA7(in, out);
        in.close();
        out.close();
    }
}
