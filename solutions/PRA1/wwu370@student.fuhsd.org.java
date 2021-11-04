import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA1 {
    public static void main(String[] args) {
        //Declaration
        Scanner sc = new Scanner(System.in);
        long N, X;
        int T;

        //loops every input
        T=sc.nextInt();
        for(int i=0;i<T;i++){
            N= sc.nextLong();
            X=(maths(N,sumofdigits(N)));
            System.out.println(X);
        }


    }

    //gets the sum of digits
    static long sumofdigits(long n) {
        long x = n;
        long sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }

//greatest common divisor
    static long GCD(long Number1, long Number2) {
        long num1=Number1;
        long num2=Number2;
        if(num2 == 0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }

    //revisions
    static long maths(long num1, long num2){
        if(GCD(num1, num2)!=1){
            return num1;
        }else{
            return maths(num1+1,sumofdigits(num1+1));
        }
    }

}