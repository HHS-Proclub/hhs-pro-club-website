import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB2 {
    public static long count = 0;
    public static int r;
    public static int c;
    public static int n;
    public static int k;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(x); i++) {
            count = 0;
            r = c = n = k = 0;
            String line = in.nextLine();
            String[] lineArr = line.split(" ");
            r = Integer.parseInt(lineArr[0]);
            c = Integer.parseInt(lineArr[1]);
            n = Integer.parseInt(lineArr[2]);
            k = Integer.parseInt(lineArr[3]);

            List<String> pos = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                pos.add(in.nextLine());
            }
            outputs.add(pictures(pos));
        }
        for (long o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    public static long pictures(List<String> pos) {
        int[][] array = new int[r][c];

        buildMatrix(pos, array);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int anchorX = i;
                int anchorY = j;

                sweepAnchor(array, anchorX, anchorY);
            }
        }
        return count;
    }

    private static void sweepAnchor(int[][] array, int anchorX, int anchorY) {
        int maxRowIndex = r - 1;
        int maxColIndex = c - 1;

        for (int i = anchorX; i <= maxRowIndex; i++) {
            for (int j = anchorY; j <= maxColIndex; j++) {
                /**
                 * First diagonal is (anchorX, anchorY) Second diagonal is (x,y)
                 */
                countPersonsInRectangle(array, anchorX, anchorY, i, j);
            }
        }
    }

    private static void countPersonsInRectangle(int[][] array, int ulx, int uly, int lrx, int lry) {
        int kidcount = 0;
        for (int i = ulx; i <= lrx; i++) {
            for (int j = uly; j <= lry; j++) {
                int elem = array[i][j];
                if (elem == 1) {
                    kidcount++;
                }
            }
        }

        if (kidcount >= k) {
            // System.out.println("(" + ulx + "," + uly + ") (" + lrx + "," +
            // lry + ")");
            count++;
        }
    }

    private static void buildMatrix(List<String> pos, int[][] array) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                array[i][j] = 0;

        for (int i = 0; i < pos.size(); i++) {
            String str = pos.get(i);
            String[] strArray = str.split(" ");
            int xPos = Integer.parseInt(strArray[0]);
            int yPos = Integer.parseInt(strArray[1]);
            array[xPos - 1][yPos - 1] = 1;
        }
    }
}
