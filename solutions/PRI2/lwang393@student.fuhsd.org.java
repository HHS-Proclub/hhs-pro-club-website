import java.io.*;
import java.util.*;

public class PRI2{
    public static String add(String str){
        String r = "";
        int i = str.length() - 1;
        for(;i >= 0;i -= 1){
            if(str.charAt(i) == '1') r += '0';
            else break;
        }
        r += '1';
        i -= 1;
        for(;i >= 0;i -= 1) r += str.charAt(i);

        String f = "";
        for(i = r.length() - 1;i >= 0;i -= 1) f += r.charAt(i);
        return f;
    }

    public static String div(String str){
        return str.substring(0, str.length() - 1);
    }

    public static String cut(String str){
        return str.substring(str.indexOf('1'));
    }

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            String str = f.readLine();
            int i = 0;
            for(;!str.equals("1");i += 1){
                if(str.charAt(str.length() - 1) == '1') str = add(str);
                else str = div(str);
                str = cut(str);
            }
            out.println(i);
        }
        out.close();
        f.close();
    }
}
