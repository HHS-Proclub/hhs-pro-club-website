import java.io.*;
import java.util.*;

public class PRA1{
    /** Could be too slow, may replace with a method that just tries to find a gcd that's not 1. */
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static long sum(long n){
        long r = 0;
        while(n != 0){
            r += n % 10;
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            long n = Long.parseLong(st.nextToken());
            while(gcd(n, sum(n)) == 1) n ++;
            out.println(n);
        }
        out.close();
        f.close();
    }
}
