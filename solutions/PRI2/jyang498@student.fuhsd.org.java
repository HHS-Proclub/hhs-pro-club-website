import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PRI2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long x = Long.parseLong(br.readLine(), 2);

            int cnt = 0;
            while (x != 1L) {
                cnt++;
                if (x % 2 == 0) {
                    x /= 2;
                } else {
                    x++;
                }
            }
            pw.println(cnt);
        }

        pw.close();
    }
}
