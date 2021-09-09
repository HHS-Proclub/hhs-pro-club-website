//package beginner;

import java.util.Scanner;

public class PRB7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int reps = Integer.parseInt(in.nextLine());

        for (int i = 0; i < reps; i++) {
            int n = Integer.parseInt(in.nextLine());
            long out = 0;

            for(int k = 0; k < n; k++){
//                System.out.println((Math.pow(2,k)-1)*(Math.pow(2,k-1)));
//                System.out.println("k = " + k);
                if(n%((Math.pow(2,k)-1)*(Math.pow(2,k-1))) == 0 && (Math.pow(2,k)-1)*(Math.pow(2,k-1)) <= n){
                    out = (long) ((Math.pow(2,k)-1)*(Math.pow(2,k-1)));
                }
            }

            System.out.println(out);
        }

        //GOOD BOY!
        in.close();
    }
}
