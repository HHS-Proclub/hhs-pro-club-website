/*
Solution: Store the number of z's and n's. These uniquely identify the
number of possible 0s and 1s to be formed. Use this to calculate the
maximum possible number.

Runtime: O(L)
*/

import java.util.*;
import java.io.*;

public class PRB3 {
    int N, L;

    PRB3() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            int num0s = 0;
            int num1s = 0;
            L = Integer.parseInt(in.readLine());
            String line = in.readLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'z') num0s++;
                else if (line.charAt(j) == 'n') num1s++;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < num1s; j++) {
                sb.append("1 ");
            }
            for (int j = 0; j < num0s; j++) {
                sb.append("0 ");
            }
            System.out.println(sb.substring(0, sb.length() - 1).toString());

            /*
            // Generate max number
            int answer = 0;
            for (int j = 0; j < num1s; j++) {
                answer = (answer + 1) << 1;
            }
            answer <<= num0s;

            System.out.println(answer)
             */
        }

        in.close();
    }

    public static void main(String[] args) throws IOException {
        new PRB3();
    }
}