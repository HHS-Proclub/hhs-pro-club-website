/**
 * Created by rishi on 2/11/2017.
 */
import java.util.Scanner;
import java.util.Stack;
public class PRA18 {
    public static boolean isBalanced(String in)
    {
        Stack<Character> st = new Stack<Character>();

        for(char chr : in.toCharArray())
        {
            switch(chr) {

                case 'a':
                    st.push(chr);
                    break;

                case 'b':
                    if(st.isEmpty() || st.pop() != 'a')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        in.nextInt();

        while(in.hasNext()){
            String N = in.next();
            if(N.length() != 0) {
                if(isBalanced(N))
                    System.out.println("Good");
                else
                    System.out.println("Bad");
            }
        }

    }
}
