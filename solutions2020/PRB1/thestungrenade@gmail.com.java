/*
Tandy loves giving out candies, but only has n candies. For the ith person she gives a candy to, she gives i candies to that person. 
For example, she first gives Randy 1 candy, then gives Pandy 2 candies, then Sandy 3. Given n, how many people can she give candies to?

Input Format
The first line is an integer x, denoting the number of test cases.
The next x lines will contain a single positive integer, n.

SAMPLE INPUT
2
1
5

Output Format
x lines, with each line containing a single integer denoting the number of people Tandy can give candies to.

SAMPLE OUTPUT
1
2
 */
import java.util.Scanner;
public class PRB1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int[] returnValues = new int[x];
		for(int i = 0; i < x; i++) {
			int n = input.nextInt();
			int p = 0; // number of people
			int currentPerson = 1;
			while(true) {
				if(n >= currentPerson) {
					n-=currentPerson;
					currentPerson++;
					p++;
				}else {
					break;
				}
			}
			returnValues[i] = p;
		}
		for(int i = 0; i < x; i++)
			System.out.println(returnValues[i]);
		input.close();
	}

}
