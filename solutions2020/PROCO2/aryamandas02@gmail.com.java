import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class PROCO2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ticket = in.nextLine();
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        List<Integer> tickets = new ArrayList<>();
        int t = Integer.parseInt(ticket);

        for (String s : strArray) {
            tickets.add(Integer.parseInt(s));
        }
        int revenue = 0;
        for (int i = 0; i < t; i++) {
            Collections.sort(tickets);
            revenue += tickets.get(tickets.size() - 1);
            tickets.set(tickets.size()-1, tickets.get(tickets.size() - 1) - 1);
        }
        System.out.println(revenue);
        in.close();
    }
}
