import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class HPI3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numOperations = in.nextLine();
        List<String> operations = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(numOperations); i++) {
            String operation = in.nextLine();
            operations.add(operation);
        }
        Stack<String> books = new Stack<>();

        for (String o : operations) {
            if (!o.equals("2") && !o.equals("3")) {
                books.push(o.substring(2, o.length()));
            } else if (o.equals("3")) {
                System.out.println(books.peek());
            } else {
                books.pop();
            }
        }
        in.close();
    }
}
