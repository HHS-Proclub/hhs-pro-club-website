import java.util.Scanner;

public class PRA1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numLines = in.nextInt();
		for(int i =0; i< numLines; i++){
			System.out.println(distinct(in.nextInt()+1));
		}
		
	}
	public static int distinct(int year){
	    while(!isDistinct(year)){
	        year++;
	    }
	    return year;
	}
	public static boolean isDistinct(int year){
		int digits[] = new int[4];
		digits[0] = year/1000;
		digits[1] = (year-(digits[0]*1000))/100;
		digits[2] = (year-((digits[0]*1000)+(digits[1]*100)))/10;
		digits[3] = (year-((digits[0]*1000)+(digits[1]*100)+(digits[2]*10)));
		
		for(int i =0; i< digits.length-1;i++){
			for(int j = i+1; j<digits.length; j++){
				if(digits[i] == digits[j]){
					return false;
				}
			}
		}
		return true;		
	}
}


