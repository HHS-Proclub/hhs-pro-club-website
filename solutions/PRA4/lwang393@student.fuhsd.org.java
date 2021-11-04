import java.io.*;
import java.util.*;

public class PRA4{
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] d = new int[n];

            st = new StringTokenizer(f.readLine());
            for(int i = 0;i < n;i++) d[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(d);
            int s = 0;
            for(int i = n - 1;i >= 0;i--) s += (n - i - 1) * d[i] + 1;
            out.println(s);
        }
        out.close();
        f.close();
    }
}
