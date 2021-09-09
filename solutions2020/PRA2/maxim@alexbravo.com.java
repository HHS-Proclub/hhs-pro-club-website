import java.awt.*;
import java.util.Scanner;
public class PRA2 {
    private static int inputLength = 2;
	private static Scanner sc = new Scanner(System.in);
    private static int[] input = createInput();
    public static void main(String[] args){
        int longStep = input[0];
        int shortStep = longStep/2;
        int totalDistance = input[1];
        boolean notThere = true;
        int dTraveled = 0;
        int stepCount = 0;
        while(notThere){
            if(dTraveled >= totalDistance){
                notThere = false;
                break;
            } 
            if(stepCount % 2 == 0){
                dTraveled += longStep;
            } else {
                dTraveled += shortStep;
            }
            stepCount++;
        }
	    //printInput();
        System.out.println(stepCount);
    }
    public static int[] createInput(){
		int[] array = new int[inputLength];
		for(int j = 0; j < inputLength; j++){
			array[j] = sc.nextInt();
		}
		return array;
		
	}
    
}