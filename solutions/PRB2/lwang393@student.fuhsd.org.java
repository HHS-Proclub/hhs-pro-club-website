import java.io.*;
import java.util.*;

public class PRB2{
    public static boolean vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int count(String str){
        int c = 0;
        for(int i = 0;i < str.length();i ++){
            if(vowel(str.charAt(i))) c ++;
        }
        return c;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        char[] v = new char[] {'a', 'e', 'i', 'o', 'u'};
        for(int ti = 0;ti < t;ti ++){
            boolean w = true;
            if(count(f.readLine()) != 5) w = false;
            if(count(f.readLine()) != 7) w = false;
            if(count(f.readLine()) != 5) w = false;
            out.println(w ? "YES" : "NO");
        }
        out.close();
        f.close();
    }
}
