import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by rishi on 1/18/2017.
 */
public class PRB16 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        String len = in.nextLine();

        while(in.hasNextLine()) {

            StringTokenizer token = new StringTokenizer(in.nextLine());

            ArrayList<Integer> inputs = new ArrayList<>();
            ArrayList<Integer> empty = new ArrayList<>();

            while (token.hasMoreTokens()) {
                int bars = Integer.parseInt(token.nextToken());
                inputs.add(bars);
            }

            boolean isPerfectLine = true;

            for(int i = 0; i < inputs.size(); i++){
                int occurences = Collections.frequency(inputs, inputs.get(i));
                if(occurences > inputs.size()+1 - occurences){
                    isPerfectLine = false;
                    break;
                }

            }
            String result = isPerfectLine == false ? "impossible" : "possible";
            System.out.println(result);

        }
    }
}
