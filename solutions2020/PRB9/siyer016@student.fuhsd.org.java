import java.util.Scanner;

public class PRB9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0; i < n; i++) {
            int a = input.nextInt();

            int j = 0;
            int count = 10;
            while(j < a) {
                count += 9;
                int countSum = 0;
                String s = Integer.toString(count);
                for(int k = 0; k < s.length(); k++) {
                    countSum += Integer.parseInt(s.substring(k, k + 1));
                }

                if(countSum == 10) j++;
            }

            System.out.println(count);
        }
    }
}