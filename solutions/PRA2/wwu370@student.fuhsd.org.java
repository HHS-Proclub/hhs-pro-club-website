import java.util.Scanner;


public class PRA2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(solve(N,K));
        }
    }

    public static int solve(int n, int k){

        int num=(n)/2;

        while(!judge(num, k, n)){
            if(judge(num,k,n)){
                return num;
            }
            if((normal(num-1, k)<n)&&(normal(num, k)<n)){
                num+=1;
            }else if((normal(num-1,k)>n)&&(normal(num,k)>n)){
                num-=1;
            }
        }


        return num;
    }
    public static boolean judge(int num, int k, int n){
        return (normal(num-1,k)<(float)n)&&((normal(num,k)>=(float) n));
    }

    public static float greaterThanOne(int a, int b){
        float vNum=a;
        float kNum=b;
        float sum=0;
        int count=1;

        while(vNum/(Math.pow(kNum, count))>=1){
            sum+=vNum/(Math.pow(kNum, count));
            count+=1;
        }
        return sum;
    }


    public static float normal(int v, int k){
        return v+greaterThanOne(v, k);
    }

}
