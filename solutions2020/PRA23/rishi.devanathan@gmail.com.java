import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA23 {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        in.nextLine();

        while(in.hasNextLine())
        {

            StringTokenizer token = new StringTokenizer(in.nextLine());

            ArrayList<Integer> inputs = new ArrayList<>();

            while (token.hasMoreTokens()) {
                int bars = Integer.parseInt(token.nextToken());
                inputs.add(bars);
            }
            int result = minMoves(inputs, inputs.size());
            System.out.println(result);

        }

    }
    private static int minMoves(ArrayList<Integer> arr, int n)
    {
        int expectedItem = n;

        for (int i=n-1; i >= 0; i--)
        {
            if (arr.get(i) == expectedItem) expectedItem--;
        }
        return expectedItem;
    }

}
