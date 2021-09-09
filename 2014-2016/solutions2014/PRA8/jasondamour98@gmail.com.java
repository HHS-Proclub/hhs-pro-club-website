import java.util.Scanner;


public class PRA8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numTestCases = input.nextInt();
		int testNum[] = new int[numTestCases]; 
		
		for(int i=0; i<numTestCases; i++){
			testNum[i] = input.nextInt();
		}

		
		
		for(int i=0; i<numTestCases; i++){
			
			int properDivisorCount=0, evenSquareCount=0;
			
			for(int j =0; j<testNum[i]; j++){
				if(j!=0 && j!=testNum[i] && testNum[i]%j==0.0 || j==1){
					properDivisorCount++;
					if((Math.pow(j,0.5))%1==0.0 && j%2==0 ){
						evenSquareCount++;
					}
				}
			}System.out.println(evenSquareCount + "/" + properDivisorCount);
		}
	}

}
