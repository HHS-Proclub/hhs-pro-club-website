import java.util.*;

public class PRI4 {
    public static void main(String[] args){
        Scanner sc;
        int T, N, x, distance;
        int[][] list;
        sc=new Scanner(System.in);

        T=sc.nextInt();
        for(int i=0;i<T;i++){

            N= sc.nextInt();
            list=new int[N][2];

            for(int j=0;j<N;j++){

                x=sc.nextInt();
                list[j][0]=x;
                distance= sc.nextInt();
                list[j][1]=distance;

            }

         checkSpit(list);

        }

    }

    public static void checkSpit(int[][] list){
        boolean isSpittedOn=false;
        int current, jCurrent;

        for(int i=0;i< list.length;i++){

            current=list[i][0]+list[i][1];

            for(int j=0;j<list.length;j++){

                jCurrent=list[j][0]+list[j][1];

                if(list[j][0]==current&&jCurrent==list[i][0]){
                    isSpittedOn=true;
                }

            }

        }

        if(isSpittedOn){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
