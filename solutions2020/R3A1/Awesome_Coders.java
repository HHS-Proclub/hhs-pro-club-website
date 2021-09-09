import java.util.Scanner;

public class R3A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R3A1 r = new R3A1();
        String rect1 = in.nextLine();
        String rect2 = in.nextLine();

        System.out.println(r.intersection(rect1, rect2));

        in.close();
    }
    public int intersection(String rect1, String rect2) {
        if ((rect1 == null || rect1.isEmpty()) || (rect2 == null || rect2.isEmpty())) {
            return -1;
        }
        String[] rect1Array = rect1.split(" ");
        String[] rect2Array = rect2.split(" ");
        int x1 = Integer.valueOf(rect1Array[0]);
        int y1 = Integer.valueOf(rect1Array[1]);
        int x2 = Integer.valueOf(rect1Array[2]);
        int y2 = Integer.valueOf(rect1Array[3]);
        int x3 = Integer.valueOf(rect2Array[0]);
        int y3 = Integer.valueOf(rect2Array[1]);
        int x4 = Integer.valueOf(rect2Array[2]);
        int y4 = Integer.valueOf(rect2Array[3]);

        int rect1Area = Math.abs(y2-y1) * Math.abs(x2-x1);
        int rect2Area = Math.abs(y4-y3) * Math.abs(x4-x3);

        return Math.abs(rect1Area - rect2Area);
    }
}
