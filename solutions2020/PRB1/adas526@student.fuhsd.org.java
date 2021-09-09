import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PRB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        List<Integer> outputs = new ArrayList<>();
        
        for (int i = 0; i < Integer.parseInt(x); i++) {
        		String s = in.nextLine();
        		String[] sArray = s.split(" ");
        		
            outputs.add(add(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[1])));
        }
        for (int o : outputs) {
            System.out.println(o);
        }
       
        in.close();
    }
    public static int add(int n1, int n2) {
        return n1+n2;
    }
}
