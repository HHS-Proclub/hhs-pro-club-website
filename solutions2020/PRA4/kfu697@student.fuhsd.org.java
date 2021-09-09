/*
Solution: The key thing here is that any snow drifts that share either an x or y
coordinate are connected. So, you can form a graph-like structure to find all connected
components (snow drifts that can all reach each other). Finally, each additional snow
drift created can only connect 2 components (otherwise they'd be joined already), so
the answer is just the # of components - 1.

To keep the runtime linear, only add 1 edge to the snow drift sharing an x or y
coordinate; this won't affect the connected component result.

Runtime: O(S) with a considerable constant factor
*/

import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class PRA4 {
    int N, S;
    HashMap<Integer, Integer> sharedX, sharedY;
    Point[] points;
    ArrayList<Integer>[] graph;

    PRA4() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            runTestCase(in, st);
        }
        in.close();
    }

    void runTestCase(BufferedReader in, StringTokenizer st) throws IOException {
        st = new StringTokenizer(in.readLine());
        S = Integer.parseInt(st.nextToken());
        points = new Point[S];
        sharedX = new HashMap<>(S, 1);
        sharedY = new HashMap<>(S, 1);
        graph = new ArrayList[S];
        for (int i = 0; i < S; i++) graph[i] = new ArrayList<>(2);
        Point c;
        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(in.readLine());
            c = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            if (sharedX.containsKey(c.x)) {
                // Add edge for shared X coordinate
                graph[i].add(sharedX.get(c.x));
                graph[sharedX.get(c.x)].add(i);
            } else sharedX.put(c.x, i);
            if (sharedY.containsKey(c.y)) {
                // Add edge for shared Y coordinate
                graph[i].add(sharedY.get(c.y));
                graph[sharedY.get(c.y)].add(i);
            } else sharedY.put(c.y, i);
        }

        // Find # of connected components with the generated graph
        int numConnected = floodfill();
        System.out.println(numConnected - 1);
    }

    int floodfill() {
        int numConnected = 0;
        boolean[] visited = new boolean[S];
        for (int i = 0; i < S; i++) {
            if (!visited[i]) {
                numConnected++;
                explore(i, visited);
            }
        }
        return numConnected;
    }

    void explore(int start, boolean[] visited) {
        visited[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int c;
        while (!q.isEmpty()) {
            c = q.poll();
            for (int o : graph[c]) {
                if (!visited[o]) {
                    visited[o] = true;
                    q.add(o);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new PRA4();
    }

    class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
