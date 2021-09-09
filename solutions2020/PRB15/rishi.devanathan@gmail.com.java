import java.util.Scanner;

/**
 * Created by rishi on 1/13/2017.
 */
public class PRB15 {
    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        int totalQuestions = in.nextInt();
        int guessed = in.nextInt();
        int correctGuess = in.nextInt();

        // Process
        int result = Math.min(totalQuestions-guessed, totalQuestions-correctGuess)+Math.min(guessed, correctGuess);
        System.out.println(result);

        // Print output

    }
}
