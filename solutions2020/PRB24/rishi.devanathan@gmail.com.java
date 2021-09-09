import java.util.Scanner;

/**
 * Created by rishi on 1/13/2017.
 */
public class PRB24 {
    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // Process
        int result =0;
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            try {
                int x = Integer.parseInt(String.valueOf(c));
                result += x;
            } catch (Exception e){
                continue;
            }

        }


        System.out.println(result);

        // Print output

    }
}
