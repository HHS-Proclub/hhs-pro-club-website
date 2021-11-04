import java.util.*;

public class PRA4 {
    public static void main(String[] args){
        Scanner sc;
        int T, n,  a;
        int cans[];

        sc= new Scanner(System.in);

        T=sc.nextInt();
        for(int i=0;i<T;i++){
            n= sc.nextInt();
            cans=new int[n];
            for(int j=0;j<n;j++){
                a= sc.nextInt();
                cans[j]=a;
            }

            System.out.println(minimumShots(cans));

        }
    }

    public static int minimumShots(int[] list){
        int shots=0;
        int[] can=list;

        sort(can);

        for(int i=0;i<can.length;i++){

            shots=shots+(can[i]*i+1);

        }

        return shots;
    }

    public static void sort(int[] arr){
        int biggest, temp;
        int length= arr.length;

        for(int i=0;i<length;i++){

            biggest=i;

            for(int j=i+1;j<length;j++){

                if(arr[j]>arr[biggest]){

                    biggest=j;

                }

            }

            temp=arr[i];
            arr[i]=arr[biggest];
            arr[biggest]=temp;

        }


    }

}
