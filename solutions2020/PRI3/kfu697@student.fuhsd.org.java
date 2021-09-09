/*
Solution: Sort the cans in decreasing order of durability, and shoot at them in that
order.

Runtime: O(C * log(C))
*/

import java.util.*;
import java.io.*;

public class PRI3 {
    int N, C;
    int[] cans;

    PRI3() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());

        for (int i=0; i<N; i++) {
            C = Integer.parseInt(in.readLine());
            cans = new int[C];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int j=0; j<C; j++) {
                cans[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(cans);
            int answer = 0;
            for (int j=C-1, k=0; j>=0; j--, k++) {
                answer += cans[j] * k + 1;
            }
            System.out.println(answer);
        }

        in.close();
    }

    public static void main(String[] args) throws IOException {
        new PRI3();
    }
}
