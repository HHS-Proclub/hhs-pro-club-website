import java.io.*;
import java.util.*;

public class PRI3{
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());

            boolean[] l = new boolean[n];
            st = new StringTokenizer(f.readLine());
            for(int i = 0;i < n;i++) l[i] = Integer.parseInt(st.nextToken()) == 1;

            int a = 0;
            for(int i = 1;i < n - 1;i++){
                if(!l[i] && l[i - 1] && l[i + 1]){
                    l[i + 1] = false;
                    a++;
                }
            }
            out.println(a);
        }
        out.close();
        f.close();
    }
}
