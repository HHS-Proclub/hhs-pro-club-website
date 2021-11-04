import java.util.Scanner;
import java.util.StringTokenizer;

public class PRI1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
            System.out.println(Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken()));
        }
    }
}
