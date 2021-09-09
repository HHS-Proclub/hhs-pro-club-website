import java.util.*;

/**
 *
 * @author Your Name
 *
 */
public class PRB14 {

    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();


        for (int i = 0; i <= length; i++) {

            StringTokenizer token = new StringTokenizer(in.nextLine());
            ArrayList<Integer> inputs = new ArrayList<>();

            while (token.hasMoreTokens()) {
                int bars = Integer.parseInt(token.nextToken());
                inputs.add(bars);
            }
            if (inputs.size() > 0){
                Collections.sort(inputs);
                int res = 1;
                int n = inputs.size();

                for (int j = 0; j < n && inputs.get(j) <= res; j++) {
                    res = res + inputs.get(j);
                }
                System.out.println(res);
            }


        }

    }

}