/*
Source: D. Fight Against Traffic, Educational Codeforces Round 40

Solution: Use Dijkstra to calculate the distance from the mayor's house to all other
nodes, along with the distance from HHS to all other nodes. Then, try putting a new
road with all pairs of nodes. There are 2 ways the mayor could use this new path to
shorten the distance - Go from A to B, or B to A. So, check both! To check A to B, the
new distance is dist(S, A) + 1 + dist(T, B). The other way is
dist(S, B) + 1 + dist(T, A). If either of these is less than dist(S, T), then this
path cannot be built. Else, it can be built! Remember not to build the path if it
already exists though.
Runtime: O(B^2)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA6 {
    int N;

    PRA6(Scanner in) throws IOException {
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            solve(in);
        }
    }

    int B, M, S, T, origDist;
    int[] sDist, tDist;
    boolean[][] adj;
    void solve(Scanner in) throws IOException {
        B = in.nextInt();
        M = in.nextInt();
        S = in.nextInt() - 1;
        T = in.nextInt() - 1;
        adj = new boolean[B][B];
        int a, b;
        for (int i = 0; i < M; i++) {
            a = in.nextInt() - 1;
            b = in.nextInt() - 1;
            adj[a][b] = true;
            adj[b][a] = true;
        }

        // Dijkstra from S and T
        sDist = dijkstra(S);
        tDist = dijkstra(T);
        origDist = sDist[T];

        // Try all pairs
        int numValid = 0;
        for (int i = 0; i < B; i++) {
            for (int j = i + 1; j < B; j++) {
                if (adj[i][j]) continue;
                if (sDist[i] + 1 + tDist[j] < origDist) continue;
                if (sDist[j] + 1 + tDist[i] < origDist) continue;
                numValid++;
            }
        }
        System.out.println(numValid);
    }

    int[] dijkstra(int s) {
        boolean[] visited = new boolean[B];
        int[] bestDist = new int[B];
        Arrays.fill(bestDist, 999999);
        bestDist[s] = 0;
        int c = s, currMinDist;
        while (c != -1) {
            visited[c] = true;
            for (int n = 0; n < B; n++) {
                if (adj[c][n] && !visited[n]) {
                    bestDist[n] = Math.min(bestDist[c] + 1, bestDist[n]);
                }
            }
            c = -1;
            currMinDist = 999999;
            for (int n = 0; n < B; n++) {
                if (!visited[n] && bestDist[n] < currMinDist) {
                    currMinDist = bestDist[n];
                    c = n;
                }
            }
        }
        return bestDist;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        new PRA6(in);
        in.close();
    }
}
