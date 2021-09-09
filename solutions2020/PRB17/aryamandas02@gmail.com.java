import java.util.Scanner;

public class PRB17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numCrates = in.nextInt();
        int loadSize = in.nextInt();

        PRB17 p = new PRB17(numCrates, loadSize);

        if (loadSize >= numCrates) {
            System.out.println(1);
        } else {
            int truckCount = p.getTruckCount();
            System.out.println(truckCount);
        }

        in.close();
    }

    private final int numCrates;
    private final int loadSize;
    private int truckCount = 0;

    public PRB17(int numCrates, int loadSize) {
        this.numCrates = numCrates;
        this.loadSize = loadSize;
    }

    public int getTruckCount() {
        truckCount = 0;
        warehouse(numCrates);
        return truckCount;
    }

    private void warehouse(int n) {
        if (n == 0) {
            return;

        } else if (n <= loadSize) {
            truckCount++;
            return;

        } else {
            warehouse(n / 2);
            warehouse(n - (n / 2));
        }
    }
}
