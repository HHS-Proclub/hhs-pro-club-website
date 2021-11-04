import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        PRA1 pra1 = new PRA1();
        long[] numArr = new long[length];
        for(int i = 0; i < length; i++) {
            numArr[i] = Long.parseLong(scanner.nextLine());
        }
        for(int i = 0; i < length; i++) {
            long num = numArr[i];
            long sum = pra1.findDigitSum(num);
            while(true) {
                if(pra1.findGCD(num, sum) > 1) {
                    System.out.println(num);
                    break;
                }
                num++;
                sum = pra1.findDigitSum(num);
            }
        }
    }
    public long findDigitSum(long num) {
        String[] arr = String.valueOf(num).split("");
        long sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + Integer.parseInt(arr[i]);
        }
        return sum;
    }
    public long findGCD(long num1, long num2) {
        if(num2 == 0) {
            return num1;
        }
        return this.findGCD(num2,num1%num2);
    }
}
