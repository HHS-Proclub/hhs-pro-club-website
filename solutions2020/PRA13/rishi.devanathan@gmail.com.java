import java.util.Scanner;

/**
 * Created by rishi on 12/2/2016.
 */
public class PRA13 {
    public static void main(String[] args) {
        // Take input
        Scanner in = new Scanner(System.in);
        long Width = in.nextLong();
        long Height = in.nextLong();
        long Max = in.nextLong();

        // Process
        System.out.println(PossibleGrids(Width,Height,Max));

        // Print output

    }
    public static long PossibleGrids(long W, long H, long M){
        long max = 0;
        for(int row=1; row <= H; row++)
            max = Math.max(max, row * (long)Math.min(W, M/row));

        return max;
    }
}
