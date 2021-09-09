package net.hhs.programming;

import java.util.Scanner;

/**
 * This program is created by Aryaman Das. I have created a Michael Chen's Math java class
 *
 * @author aryamandas
 *
 */
public class PRB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = in.nextInt();

        int product = 3 * number;
        System.out.println("The product of " + number + " and 3 is: " + product);

        in.close();
    }
}
