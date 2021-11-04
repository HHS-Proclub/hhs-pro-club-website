import java.io.*;
import java.util.*;

public class PRI4{
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[][] c = new int[n][2];
            for(int i = 0;i < n;i++){
                st = new StringTokenizer(f.readLine());
                c[i][0] = Integer.parseInt(st.nextToken());
                c[i][1] = Integer.parseInt(st.nextToken());
            }

            boolean s = false;
            for(int i = 0;i < n && !s;i++){
                for(int j = i + 1;j < n && !s;j++){
                    if(c[i][0] + c[i][1] == c[j][0] && c[j][0] + c[j][1] == c[i][0]) s = true;
                }
            }
            out.println(s ? "YES" : "NO");
        }
        out.close();
        f.close();
    }
}
