/*
Solution: Convert the given pair info into a graph. Then, floodfill that graph, only
starting from unvisited nodes. After finishing a connected component of the graph, add
the minimum of all gold costs in that component to the answer.

Runtime: O(S + P)
*/

import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class PRI4 {
    int N, S, P;
    int[] gold;
    ArrayList<Integer>[] graph;

    PRI4() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            S = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            gold = new int[S];
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < S; j++) gold[j] = Integer.parseInt(st.nextToken());

            graph = new ArrayList[S];
            for (int j = 0; j < S; j++) graph[j] = new ArrayList<>(2);
            int a, b;
            for (int j = 0; j < P; j++) {
                st = new StringTokenizer(in.readLine());
                a = Integer.parseInt(st.nextToken()) - 1;
                b = Integer.parseInt(st.nextToken()) - 1;
                graph[a].add(b);
                graph[b].add(a);
            }

            System.out.println(floodfill());
        }
        in.close();
    }

    int floodfill() {
        boolean[] visited = new boolean[S];
        int answer = 0;
        for (int i = 0; i < S; i++) {
            if (!visited[i]) {
                answer += search(i, visited);
            }
        }
        return answer;
    }

    int search(int start, boolean[] visited) {
        int minGold = gold[start];
        visited[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int c = q.poll();
            for (int o : graph[c]) {
                if (!visited[o]) {
                    visited[o] = true;
                    minGold = Math.min(gold[o], minGold);
                    q.add(o);
                }
            }
        }
        return minGold;
    }

    public static void main(String[] args) throws IOException {
        new PRI4();
    }
}
