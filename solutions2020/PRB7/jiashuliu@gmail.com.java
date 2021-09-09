import java.util.Scanner;

import static java.lang.Character.valueOf;

/**
 * Created by a on 11/2/16.
 */
public class PRB7 {

    public double processInput(){
        Scanner kbd = new Scanner(System.in);

        int numInts = kbd.nextInt();

        kbd.nextLine();
        String listInts = kbd.nextLine();

        int pickedInt = kbd.nextInt();

        int numPickedInts = 0;

        String numbers[] = listInts.split(" ");

        for(int i = 0; i < numInts; i++){
            int currentInt = Integer.valueOf(numbers[i]);

            if(currentInt == pickedInt)
                numPickedInts++;
        }

        return (double) (numPickedInts) / numInts;
    }

    public static void main(String args[]){
        PRB7 lamo = new PRB7();
        System.out.println((int)(lamo.processInput() * 100));
    }

}
