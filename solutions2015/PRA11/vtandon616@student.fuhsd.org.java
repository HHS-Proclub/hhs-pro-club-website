import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA11 {
	public static void main(String [] memes){
		System.out.println();
		Scanner s = new Scanner(System.in);
		int numNumbers = Integer.parseInt(s.nextLine());
		String numbersLine = s.nextLine();
		String[] stringsNumbers = numbersLine.split(" ");
		int[] theNumbers= new int[numNumbers];
		for(int i = 0; i < numNumbers; i++){
			theNumbers[i] = Integer.parseInt(stringsNumbers[i]);
		}
		
		int temp = 0;
		ArrayList<Integer> theTriples = new ArrayList<Integer>();
		boolean haventfoundone = true;
		for(int i = 0; i < numNumbers; i++){
			for(int j = 0; j < numNumbers; j++){
				if(theNumbers[j] == theNumbers[i] + 1 && haventfoundone){
					haventfoundone = false;
					temp = theNumbers[j];
				}else if(!haventfoundone && theNumbers[j] == theNumbers[i]+2){
					haventfoundone = true;
					theTriples.add(theNumbers[i]);
					theTriples.add(temp);
					theTriples.add(theNumbers[j]);
					break;
				}
			}
		}
		haventfoundone = true;
		for(int i = 0; i < numNumbers; i++){
			for(int j = 0; j < numNumbers; j++){
				if(theNumbers[j] == theNumbers[i] - 1 && haventfoundone){
					haventfoundone = false;
					temp = theNumbers[j];
				}else if(!haventfoundone && theNumbers[j] == theNumbers[i]-2){
					haventfoundone = true;
					theTriples.add(theNumbers[i]);
					theTriples.add(temp);
					theTriples.add(theNumbers[j]);
					break;
				}
			}
		}
		
		System.out.println(theTriples.size()/3 - 1);
	}
}
