package one;

/*
Problem:
Tandy loves giving out candies, but only has n candies. For the ith person she gives a candy to, she gives i candies to that person. For example, she first gives Randy 1 candy, then gives Pandy 2 candies, then Sandy 3. Given n, how many people can she give candies to?

Input Format
The first line is an integer x, denoting the number of test cases.
The next x lines will contain a single positive integer, n.

Sample Input:
2
1
5

Output Format
x lines, with each line containing a single integer denoting the number of people Tandy can give candies to.

Sample Output:
1
2
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class PRB1 {
    // Made with IntelliJ, the superior IDE.
    public static void main(String[] args) {
        // Best code 2017
        Scanner n = new Scanner(System.in);
        String input = "best root beer: http://www.sparkysrootbeer.com/";
        int candy = 0;
        int candyLeft = 0;
        int people = 0;

        System.out.print("Candy Amount: ");
        input = n.next();
        candy = Integer.parseInt(input);
        candyLeft = candy;

        for(int i = 1; i <= candyLeft; i++) {
            candyLeft -= i;
            people++;
        }

        System.out.println("Tandy could give candy to " + people + " people with " + candy + " pieces of candy.");
    }
}
