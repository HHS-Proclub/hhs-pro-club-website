/*
Solution: Sort the songs in order of decreasing beauty. Then, iterate through the sorted
list of songs. Keep track of the maximum total sum of the length of the songs before the
current one if you're only allowed to choose K songs (can be done using a heap). Calculate
the pleasure at each index, and max them all to get the answer.

I think this is the first non-trivial problem so far. I think it deserves its own separate
solveTestCase() function. :)
Hopefully it gets harder from here!

Runtime: O(S * log(K))
*/

import java.util.*;
import java.io.*;

public class PRA3 {
    int N, S, K;
    Song[] songs;

    PRA3() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            S = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            songs = new Song[S];
            int l, b;
            for (int j = 0; j < S; j++) {
                st = new StringTokenizer(in.readLine());
                l = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                songs[j] = new Song(l, b);
            }
            Arrays.sort(songs, Comparator.comparingInt(a -> a.beauty));
            solveTestCase();
        }
        in.close();
    }

    void solveTestCase() {
        long bestAnswer = 0;
        long currLengthSum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(K+1);
        for (int i=S-1; i>=0; i--) {
            currLengthSum += songs[i].length;
            pq.add(songs[i].length);
            // Remove minimum length if needed
            if (i <= S-1-K) {
                currLengthSum -= pq.poll();
            }

            // Calculate current pleasure, and max with answer
            bestAnswer = Math.max(currLengthSum * songs[i].beauty, bestAnswer);
        }
        System.out.println(bestAnswer);
    }

    public static void main(String[] args) throws IOException {
        new PRA3();
    }

    static class Song {
        int length, beauty;
        Song(int length, int beauty) {
            this.length = length;
            this.beauty = beauty;
        }
    }
}
