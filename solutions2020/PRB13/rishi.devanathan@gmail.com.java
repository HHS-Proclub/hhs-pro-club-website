import java.util.Scanner;

/**
 * Created by rishi on 12/2/2016.
 */
public class PRB13 {

    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        int k1 = in.nextInt();
        int k2 = in.nextInt();
        int k3 = in.nextInt();
        int k4 = in.nextInt();


        int count124 = 0;
        int count12 = 0;

        // Process
        while(0 < k1){

            if(k1 > 0 && k2 > 0){
                if (k4 > 0){
                    count124 ++;
                }
                else{
                    count12 ++;
                }
            }
            k1 --;
            k2 --;
            k4 --;


        }


        // Print output
        System.out.println(count12*12 + count124*142);

    }
}
