import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;

/**
 * Created by rishi on 12/3/2016.
 */

class PRB5 {
    public static void main(String[] args) {
        // Take input

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        ArrayList<Integer> arrayA10 = new ArrayList<>();
        ArrayList<Integer> arrayB10 = new ArrayList<>();


        StringTokenizer line1 = new StringTokenizer(in.nextLine());
        StringTokenizer line2 = new StringTokenizer(in.nextLine());

        while(line1.hasMoreTokens()){
            int i = Integer.parseInt(line1.nextToken());
            arrayA.add(i);
        }
        while(line2.hasMoreTokens()){
            int j = Integer.parseInt(line2.nextToken());
            arrayB.add(j);
        }


        // Process
        for(int k : arrayA){
            if(k % 10 == 0){
                arrayA10.add(k);
            }
        }
        for(int m : arrayB){
            if(m % 10 == 0){
                arrayB10.add(m);
            }
        }

        // Print output
        System.out.println(Collections.max(arrayA10) + Collections.max(arrayB10));
    }
}
