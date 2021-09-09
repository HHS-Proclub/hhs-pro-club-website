/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PRA17
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();

        while(in.hasNext()){
            int x = in.nextInt();
            System.out.println(Solution(x));

        }
    }
    public static int Solution(int num){

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum+= greatestOddDiviser(i);
        }

        return sum;

    }

    public static int greatestOddDiviser(int i){

        int max = 0;
        for(int j = 1; j <= i; j++){
            if(j%2 != 0 && i%j == 0){
                max = j;
            }
        }

        return max;
    }
}