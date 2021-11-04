import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB3 {
    public static void main(String[] args){
        int t, n, m, c, x, y;
        Scanner sc=new Scanner(System.in);
        int[] gold = new int[0];
        int[][] pairs = new int[0][];

        t=sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            m= sc.nextInt();

            pairs=new int[m][2];
            gold=new int[n];

            for(int j=0;j<n;j++){
                c= sc.nextInt();
                gold[j]=c;
            }

            for(int k=0;k<m;k++){
                x =sc.nextInt();
                y= sc.nextInt();
                pairs[k][0]=x;
                pairs[k][1]=y;
            }


        }

        System.out.println(solve(gold,pairs));
    }

    public static int solve(int[] GOLD, int[][] PAIRS){
        int list[]=GOLD;
        int sum=0;
        int n;

        for(int i=0;i< PAIRS.length;i++){
            n=PAIRS[i][1]-1;
            list[n]=0;
        }

        for(int i=0;i<list.length;i++){
            sum+=list[i];
        }

        return sum;
    }
}
