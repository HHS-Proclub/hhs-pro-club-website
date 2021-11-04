import java.io.*;
import java.util.*;

public class PRB1{
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        out.println(n + 1);
        out.close();
        f.close();
    }
}
