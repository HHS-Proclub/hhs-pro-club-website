import java.util.*;
import java.io.*;
public class HPI5 {
    public static void main (String [] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(in.readLine());
        HashMap<String, Integer> givers = new HashMap(num);
        for (int i = 0; i < num; i++) {
            givers.put(in.readLine(), i);
        }
        int[] money = new int[num];
        String giver;
        while ((giver = in.readLine()) != null) {
            String gift = in.readLine();
            st = new StringTokenizer(gift);
            int amt = Integer.parseInt(st.nextToken());
            int ppl = Integer.parseInt(st.nextToken());
            for (int i = 0; i < ppl && ppl != 0; i ++) {
                money[givers.get(in.readLine())] += amt / ppl;
            }
            if (ppl != 0) {
                money[givers.get(giver)] -= (amt - amt % ppl);
            }
        }
        print(givers, num, money);
    }
    public static void print(HashMap<String, Integer> givers, int num, int[] money) throws IOException{
        HashMap <Integer, String> givers2 = new HashMap(num);
        Object[] keys = givers.keySet().toArray();
        for (Object key: keys) {
            givers2.put((Integer)givers.get(key), (String)key);
        }
        for (int i = 0; i < num; i ++) {
            System.out.println(givers2.get(i) + " " + money[i]);
        }
    }
}