/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PRB17
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int numCrates = in.nextInt();
        int loadSize = in.nextInt();

        System.out.println(solve(numCrates, loadSize));

    }
    public static int solve(int m, int n){

        return ((m > n) ? (solve(m/2, n) + solve (m-m/2, n)) : (m==0) ? 0 : 1);
    }
}