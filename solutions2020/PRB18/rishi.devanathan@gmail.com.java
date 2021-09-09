import java.util.Scanner;

/**
 *
 * @Rishikesh
 *
 */
public class PRB18 {

    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        in.nextInt();

        while (in.hasNext()) {
            String S = in.next();
            System.out.println(Solution(S));
        }


    }

    private static String Solution(String S) {

        boolean isPerfectString = true;

        for (int c = 0; c < S.length(); c++) {
            for (int i = 1; i <= S.length() - c; i++) {
                String sub = S.substring(c, c + i);
                if(checkPerfectString(sub)){
                    isPerfectString = false;
                }
            }
        }

        String result = !isPerfectString? "not square-free":"square-free";
        return result;


    }
    private static boolean checkPerfectString(String sub){

        if (sub.length() <= 1){
            return false;
        }
        if(sub.substring(0, sub.length()/2).equals(sub.substring(sub.length()/2,sub.length()))){
            return true;
        }
        return false;
    }

}
 