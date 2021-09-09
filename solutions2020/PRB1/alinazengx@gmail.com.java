import java.util.Scanner;
/**
 * multiply by 3 : Michael Chen's Math
 * 
 * @author Lina Zeng
 * @version September 8, 2016
 */
public class PRB1
{
    /**
     * Asks user for input, reads it, and returns the input.
     * 
     * @return  a line of user input
     */
    public int getUserInput( )
    {
        System.out.print("Enter integer: ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt( );
        return num;
    }

    public void triple(int num)
    {
        int triple = num*3; 
        System.out.println(num + " multipled by 3 is " + triple); 
    }

    public static void main (String [] args)
    {
        PRB1 x = new PRB1();
        int userInput = 0;
        while (userInput!=999)
        {
            userInput = x.getUserInput();
            x.triple(userInput);
        }
    }
}
