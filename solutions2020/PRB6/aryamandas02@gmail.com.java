import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PRB6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String input = in.nextLine();
            String[] inputArr = input.split(" ");
            int n = Integer.parseInt(inputArr[0]);
            int k = Integer.parseInt(inputArr[0]);

            String pows = in.nextLine();
            String[] powarray = pows.split(" ");
            int[] powArray = new int[n];
            for (int idx = 0; idx < n; idx++) {
                powArray[idx] = Integer.parseInt(powarray[idx]);
            }

            int res = winnerPower(k, powArray);
            outputs.add(res);

        }
        for (long o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    private static int winnerPower(int k, int[] powers) {

        if (powers.length == 1) {
            return powers[0];
        }

        if (powers.length == 2) {
            return Math.max(powers[0], powers[1]);
        }

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i : powers) {
            queue.add(i);
        }

        int currentWinnerCount = 0;
        int curWinnerPower = Math.max(queue.get(0), queue.get(1));
        while (true) {
            if (curWinnerPower == Math.max(queue.get(0), queue.get(1))) {
                currentWinnerCount++;

                int indexToBeMoved = (curWinnerPower == queue.get(0)) ? 1 : 0;
                queue.add(queue.remove(indexToBeMoved));
            } else if (curWinnerPower < Math.max(queue.get(0), queue.get(1))) {
                currentWinnerCount = 1;

                curWinnerPower = Math.max(queue.get(0), queue.get(1));
                int indexToBeMoved = (curWinnerPower == queue.get(0)) ? 1 : 0;
                queue.add(queue.remove(indexToBeMoved));
            }

            if (currentWinnerCount == k) {
                return curWinnerPower;
            }
        }
    }
}
