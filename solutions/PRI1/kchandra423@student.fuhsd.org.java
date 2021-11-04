import java.util.Scanner;

public class PRI1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(s.nextInt()+s.nextInt());
        }
    }
}
