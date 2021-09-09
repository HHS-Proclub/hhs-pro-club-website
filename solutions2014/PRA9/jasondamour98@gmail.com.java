import java.util.Scanner;


public class PRA9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numSeats= input.nextInt(),shift = input.nextInt(),count = 0,result = 0, activeLocation=1;
		boolean seatIsPlaced[] = new boolean[numSeats];
		
		for(int j=0; j<numSeats; j++){
			seatIsPlaced[j]=false;
		}	
		
		

		
		while(count<numSeats){
			count++; 
			if(seatIsPlaced[activeLocation]==false){
				seatIsPlaced[activeLocation]=true;	
			}
			for(int i=0; i<shift; i++){
				if(count==numSeats){
					break; 
				}activeLocation++;activeLocation=(activeLocation%numSeats);
				if(seatIsPlaced[activeLocation]==true){
					i--;
				}
			}if(count==numSeats){
				break; 
			}
		}
		result=(Math.abs(numSeats-activeLocation));
		System.out.println((result+1)%numSeats);
	}
}
