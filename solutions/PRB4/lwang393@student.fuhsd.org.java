import java.io.*;
import java.util.*;

public class PRB4{
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            String s = f.readLine();

            int u = 0;
            for(int i = 0;i < s.length();i++) if(Character.isUpperCase(s.charAt(i))) u++;

            out.println(u > s.length() / 2 ? s.toUpperCase() : s.toLowerCase());
        }
        out.close();
        f.close();
    }
}
