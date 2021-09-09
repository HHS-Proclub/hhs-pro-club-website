//package beginner;

import java.util.Scanner;

public class PRB5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int reps = Integer.parseInt(in.nextLine());
        for(int trash = 0; trash < reps; trash++){
            String raw = in.nextLine();
            int n = Integer.parseInt(raw.split(" ")[0]);
            int k = Integer.parseInt(raw.split(" ")[1]);
            //WE GOT OUR DATA

            int inc = n;
            while(countZeroes(inc) != k) {
                inc += 2*n;
            }
            System.out.println(inc);
        }
    }
    private static int countZeroes(int n){
        int count = 0;
        while(n != 0){
            if(n%10 == 0)
                count++;
            n = n/10;
        }
        return count;
    }
}
