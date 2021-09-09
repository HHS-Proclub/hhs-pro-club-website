/*
Solution: BFS. The # will never go above 2B (never optimal).
Runtime: O(4B)
*/

import java.util.*;
import java.io.*;

public class PRI6 {
    int N;

    PRI6(BufferedReader in, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            out.println(bfs(A, B));
        }
    }

    int bfs(int A, int B) {
        boolean[] visited = new boolean[209];
        visited[A] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(A);
        int currLeft = 1, nextLeft = 0, currCost = 0;
        int c;
        while (!q.isEmpty()) {
            c = q.poll();
            if (currLeft == 0) {
                currLeft = nextLeft;
                nextLeft = 0;
                currCost++;
            }
            currLeft--;

            if (c == B) return currCost;

            if (c != 1 && !visited[c-1]) {
                visited[c-1] = true;
                nextLeft++;
                q.add(c-1);
            }

            if (c * 2 < 209 && !visited[c*2]) {
                visited[c*2] = true;
                nextLeft++;
                q.add(c*2);
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // BufferedReader in = new BufferedReader(new FileReader("PRI6.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("PRI6.out")));
        new PRI6(in, out);
        in.close();
        out.close();
    }
}
