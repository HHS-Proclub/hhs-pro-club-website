/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PRA12 {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        while(in.hasNextLine()){
            String S = in.nextLine();
            String message = Solution(S).equals("") ? "Possible" : "Impossible";
            System.out.println(message);
        }

    }
    public static String Solution(String S){

        int length = S.length();
        for(int j = 0; j <= length-2; j++){

            if(S.substring(j,j+1).equals(S.substring(j+1,j+2)) && length > 2){
                S = S.substring(0,j)+S.substring(j+2,length);
                length-=2;
                j-=2;

                if(j < 0){
                    j = 0;
                }
            }


        }
        if (length <= 2 && S.charAt(0) == S.charAt(1)){
            S = "";
        }
        return S;
    }
}