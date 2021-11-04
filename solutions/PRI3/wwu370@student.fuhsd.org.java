import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PRI3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n, T, a;
        ArrayList<Integer> flats;

        T= scanner.nextInt();

        for(int i=0;i<T;i++){

            n=scanner.nextInt();
            flats=new ArrayList<>();

            for(int k=0;k<n;k++){

                a= scanner.nextInt();
                flats.add(a);

            }

            System.out.println(solve(flats));

        }

    }

    public static int solve(ArrayList<Integer> list){

        int count=0;

        for(int i=1;i<list.size()-2;i++){

            if(list.get(i-1)==1&&list.get(i)==0&&list.get(i+1)==1){

                if(list.get(i+2)==0&&list.get(i+3)==1){

                    list.set(i+1, 0);
                    count++;

                }else{

                    list.set(i-1, 0);
                    count++;

                }
            }

        }

        System.out.println(list);
        return count;

    }
}
