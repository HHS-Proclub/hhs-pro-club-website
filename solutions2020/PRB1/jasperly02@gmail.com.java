import java.util.*;
public class PRB1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int problems = sc.nextInt();

        for (int i = 0; i < problems; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b);
        }


    }
}
