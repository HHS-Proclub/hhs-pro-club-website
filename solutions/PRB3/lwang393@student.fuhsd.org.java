import java.io.*;
import java.util.*;

public class PRB3{
    public static class Character{
        public ArrayList<Integer> f;
        public boolean v;
        public int c;

        public Character(int c){
            this.f = new ArrayList<>();
            this.v = false;
            this.c = c;
        }
    }

    public static Character[] c;
    public static ArrayList<Character> group;

    public static void fill(Character r){
        r.v = true;
        group.add(r);
        for(int i = 0;i < r.f.size();i ++) if(!c[r.f.get(i)].v) fill(c[r.f.get(i)]);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int ti = 0;ti < t;ti += 1){
            st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            c = new Character[n];
            st = new StringTokenizer(f.readLine());
            for(int i = 0;i < n;i ++) c[i] = new Character(Integer.parseInt(st.nextToken()));
            for(int i = 0;i < m;i ++){
                st = new StringTokenizer(f.readLine());
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                c[a].f.add(b);
            }

            int a = 0;
            for(int i = 0;i < n;i ++){
                if(!c[i].v){
                    group = new ArrayList<>();
                    fill(c[i]);
                    int min = group.get(0).c;
                    for(Character c : group) min = Math.min(min, c.c);
                    a += min;
                }
            }

            out.println(a);
        }
        out.close();
        f.close();
    }
}
