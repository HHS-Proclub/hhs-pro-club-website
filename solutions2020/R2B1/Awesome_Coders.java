import java.util.Scanner;
import java.util.Stack;

public class R2B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int difference = Integer.MAX_VALUE;
        Stack<String> items = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] <= m && difference > (m - Math.abs(arr[i] + arr[j]))) {
                    difference = (m - Math.abs(arr[i] + arr[j]));
                    items.push((i+1) + " " + (j+1));
                }
            }
        }
        System.out.println(items.peek());
        in.close();
    }
    public static void main0(String[] args) {
        String originalString = "abcde";

        char[] c = originalString.toCharArray();

        // Replace with a "swap" function, if desired:
        char temp = c[0];
        c[0] = c[1];
        c[1] = temp;

        String swappedString = new String(c);

        System.out.println(originalString);
        System.out.println(swappedString);
    }
}
