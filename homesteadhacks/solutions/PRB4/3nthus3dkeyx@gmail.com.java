import java.util.*;
public class PRB4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            int num = sc.nextInt();
            if(num%2==0)
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        }


    }
}
