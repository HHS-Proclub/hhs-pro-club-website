import java.util.Scanner;

public class PRA4 {
    //ok
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(System.getProperty("line.separator"));
        boolean correct;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            correct = false;
            int len = input.nextInt();
            String s = input.next();
            for (int j = 0; i < len; i++) {
                String a = s.substring(0,j);
                String b = s.substring(j, len);
                int sum1 = 0, sum2 = 0;
                for (int k = 0; k < a.length(); k++) {
                    sum1 += Integer.parseInt(a.substring(k, k+1));
                }
                for (int k = 0; k < b.length(); k++) {
                    sum2 += Integer.parseInt(b.substring(k, k+1));
                }
                if (sum1==sum2) {
                    System.out.println("YES");
                    correct = true;
                    break;
                }
            }
            if (!correct) {
                System.out.println("NO");
            }
        }
    }
}
