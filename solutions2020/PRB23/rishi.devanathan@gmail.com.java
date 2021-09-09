import java.util.Scanner;

/**
 * Created by rishi on 1/13/2017.
 */
public class PRB23 {
    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // Process
        String[] words = str.split(" ");
        String result = "";
        for(String k: words){
            String m = String.valueOf(k.charAt(0)).toLowerCase();
            result += m;
        }

        // Print output
        System.out.println(result);
    }
}
