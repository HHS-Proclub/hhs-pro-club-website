import java.io.*;
import java.util.*;

public class PRA3{
    public static class Track implements Comparable<Track>{
        public int l;
        public int b;

        public Track(int l, int b){
            this.l = l;
            this.b = b;
        }

        @Override
        public int compareTo(Track o){
            return o.l - l;
        }
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

            Track[] p = new Track[n];
            HashSet<Integer> hb = new HashSet<>();
            for(int i = 0;i < n;i ++){
                st = new StringTokenizer(f.readLine());
                int cl = Integer.parseInt(st.nextToken());
                int cb = Integer.parseInt(st.nextToken());
                p[i] = new Track(cl, cb);
                hb.add(cb);
            }
            Arrays.sort(p);

            long a = 0;
            ArrayList<Integer> b = new ArrayList<>(hb);
            for(int i = 0;i < b.size();i ++){
                long m = 0;
                int c = 0;
                for(int j = 0;j < p.length && c < k;j ++){
                    if(p[j].b >= b.get(i)){
                        m += p[j].l;
                        c ++;
                    }
                }
                a = Math.max(a, m * b.get(i));
            }
            out.println(a);
        }
        out.close();
        f.close();
    }
}
