import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Alek
 * @version 9/9/2015
 */
public class PRB1 {


    private Scanner s;


    public PRB1() {
        s = new Scanner(System.in);

        System.out.println("" + multiply(s.nextInt()));

    }

    public int multiply(int x) {
        return 3* x;
    }



    public static void main(String[] args) {

        PRB1 inNOut = new PRB1();

    }

}
