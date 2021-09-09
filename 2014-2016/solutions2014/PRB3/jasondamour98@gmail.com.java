import java.util.Scanner;


public class PRB3 {
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		int numNums = input.nextInt(), sum = 0;
		
		for(int i=0; i<numNums; i++){
			sum+=input.nextInt();
		}
		System.out.println(sum/numNums);

		
	}

}
