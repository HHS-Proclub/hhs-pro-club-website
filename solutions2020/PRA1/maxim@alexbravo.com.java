import java.awt.*;
import java.util.Scanner;
public class PRA1 {
	private static Scanner sc = new Scanner(System.in);
    private static int[] input = createInput();
    private static boolean[] result = new boolean[5];
    public static void main(String[] args){
    	int c = 0;
        for(int i = 0; i < input.length; i += 3){
            int oneInchCount = input[i];
            int fiveInchCount = input[i+1];
            int sum = input[i+2];
            int brickCountSum = (oneInchCount + (fiveInchCount * 5));
            if(brickCountSum > sum){
                result[c] = getResult(oneInchCount, fiveInchCount, sum);
            } else if(brickCountSum == sum){
                result[c] = true;
            } else {
                result[c] = false;
            }
            c++;
        }
	    //printInput();
        printResults(result);
    }
    public static int[] createInput(){
		int[] array = new int[15];
		for(int j = 0; j < 15; j++){
			array[j] = sc.nextInt();
		}
		return array;
		
	}
    public static boolean getResult(int oneCount, int fiveCount, int sum){
        int mutatableSum = sum;
        boolean one = false;
        boolean five = false;
        int fittingFiveCount = sum / 5;
        if(fiveCount >= fittingFiveCount){
            five = true;
            mutatableSum -= fittingFiveCount * 5;
        } else if(fiveCount < fittingFiveCount){
            five = true;
            mutatableSum -= fiveCount * 5;
        }
        if(oneCount >= mutatableSum){
           one = true;
           return true;
        } else {
           return false;
        }
    }
    public static void printInput(){
        System.out.println("Input: ");
        for(int i = 0; i < input.length; i += 3){    
            System.out.print("" + input[i] + " "+ input[i+1] + " "+ input[i+2]);
            
            System.out.println();
        }
    }
    public static void printResults(boolean[] r){
        //System.out.println("Output: ");
        for(int i = 0; i < r.length; i++){
            System.out.println("" + r[i]);
        }
    }
}