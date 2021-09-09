import java.util.Scanner;
public class HPI2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int result = 0;
        for(int i = 1; i <= k; i++){
            if(i*i <= k){
                result++;
            }
        }
        System.out.print(result);

    }
}
