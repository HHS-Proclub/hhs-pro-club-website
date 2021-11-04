import java.io.*;
import java.util.*;

public class PRA2{
    public static boolean check(int n, int k, int v){
        int d = 0;
        int r = 1;
        while(d < n && v / r > 0){
            d += v / r;
            r *= k;
        }
        return d >= n;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int a = 1;
            int b = n * k;
            while(a < b){
                int m = (a + b) / 2;
                if(check(n, k, m)) b = m;
                else a = m + 1;
            }
            out.println(a);
        }
        out.close();
        f.close();
    }
}
