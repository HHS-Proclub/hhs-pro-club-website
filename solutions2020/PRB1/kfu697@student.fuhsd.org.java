import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the # of checkpoints
        int N = sc.nextInt();
        // Make an array with checkpoint heights
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        int numPeaks = 0;
        for (int i = 1; i < N - 1; i++) {
            if (heights[i] > heights[i-1] && heights[i] > heights[i+1]) numPeaks++;
        }
        System.out.println(numPeaks);
    }
}