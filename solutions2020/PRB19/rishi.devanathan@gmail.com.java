import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by rishi on 1/18/2017.
 */
class PRB19 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        in.nextLine();

        while(in.hasNextLine()) {

            StringTokenizer token = new StringTokenizer(in.nextLine());

            ArrayList<Integer> inputs = new ArrayList<>();

            while (token.hasMoreTokens()) {
                int bars = Integer.parseInt(token.nextToken());
                inputs.add(bars);
            }
/*
            boolean isNice = true;

            for(int i = 0; i < inputs.size()-1; i++){
                if(inputs.get(i) > inputs.get(i+1)){
                    isNice = false;
                }
            }

            System.out.println(isNice);*/

            /*int count = 0;
            for(int i = 0; i < inputs.size()-1; i++){
                int j = inputs.get(i);
                int k = inputs.get(i+1);
                if(j < k){
                    j--;
                    count++;
                }
            }*/

            int a = inputs.get(0);
            int b = inputs.get(1);
            int c = inputs.get(2);
            int count = 0;

            while(true){

                if(a < b && b < c){
                    break;
                }
                if(a <= 1 || b <= 1 || c <= 1){
                    count = -1;
                    break;
                }
                if(b >= c){
                    b--;
                    count++;
                }
                if(a >= b){
                    a--;
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
