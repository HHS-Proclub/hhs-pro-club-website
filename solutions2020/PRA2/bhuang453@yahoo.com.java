import java.util.Scanner;

public class PRA2 {

    public static void main(String[] argv){

        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int myNums[] = new int[y];
        for (int i = 0; i < y; i++){
            myNums[i] = in.nextInt();
        }

        for (int i = 0; i < y; i++){
            //myNums[i] = reverse(myNums[i]);
            if (reverse(myNums[i]) != myNums[i]){
                if (checkPrime(myNums[i]) && checkPrime(reverse(myNums[i]))){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }

        }
    }
    public static int reverse(int x){
        int reverse = 0;

        while(x != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + x%10;
            x = x/10;
        }
        return reverse;
    }
    public static boolean checkPrime(int x){
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
