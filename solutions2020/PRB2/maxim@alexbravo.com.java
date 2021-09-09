import java.awt.*;
import java.util.Scanner;
public class PRB2 {
	private static Scanner sc = new Scanner(System.in);
    private static int[] input = createInput();
    private static boolean[] result = new boolean[5];
    public static void main(String[] args){
    	int c = 0;
    	int ot = 0;
        for(int i = 0; i < input.length; i ++){
           ot += input[i];
        }
	    //printInput();
        System.out.println(ot);
    }
    public static int[] createInput(){
		int[] array = new int[5];
		for(int j = 0; j < 5; j++){
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
    
}