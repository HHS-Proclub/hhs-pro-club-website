import java.util.Scanner;
import java.util.Arrays;

public class PRB3 {
    public static void main(String[] argv) {

        Scanner x = new Scanner(System.in);
        int wood = x.nextInt();
        int[] energy = new int[wood];
        for (int y = 0; y < wood; y++) {
            int k = x.nextInt();
            int i = x.nextInt();
            int desiredLengths[] = new int[i];
            int sum = 0;
            for (int a = 0; a < i; a++) {
                desiredLengths[a] = x.nextInt();
                sum += desiredLengths[a];
            }
            if (sum != k) {
                //System.out.println("NO");
                return; //Bad input; bail out...
            }
            Arrays.sort(desiredLengths);
            energy[y] = 0;
            for (int z = i - 1; z > 0; z--) {
                energy[y] += k;
                k -= desiredLengths[z];
            }
        }
        for (int y = 0; y < wood; y++){
            System.out.println(energy[y]);
        }
    }
}
