import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA10 {
    public static void main(String[] args) {
        PRA10 p = new PRA10();
        Scanner in = new Scanner(System.in);
        String tests = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(tests); i++) {
            String s = in.nextLine();
            outputs.add(p.numOfPalindPrimes(s));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int numOfPalindPrimes(String s) {
        String[] sArray = s.split(" ");
        int min = Integer.parseInt(sArray[0]);
        int max = Integer.parseInt(sArray[1]);
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    private boolean isPalindrome(int num) {
        String n = String.valueOf(num);
        char[] numArray = n.toCharArray();

        int left = 0;
        int right = numArray.length - 1;

        while (true) {
            if (numArray[left] != numArray[right]) {
                return false;

            } else if (left >= right) {
                return true;

            }
            left++;
            right--;
        }
    }
    private boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
