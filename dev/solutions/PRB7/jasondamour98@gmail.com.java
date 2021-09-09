import java.util.Scanner;


public class PRB7 {
	private static int diff, ratio, nextNum;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numSequences = Integer.parseInt(input.nextLine()); 
		String sequence[] = new String[numSequences];
		
		
		for(int i=0; i<numSequences; i++){
			sequence[i] = input.nextLine();
			int counter = 1;
			for(int l=0; l<sequence[i].length(); l++){
				if((""+sequence[i].charAt(l)).equals(" ")){
					counter++;
				}
			}
			
			StringBuffer num2 = new StringBuffer(sequence[i]);
			String[] stringDigits = new String[counter];
			for(int f=0; f<counter; f++){
				if((num2.charAt(0)+"").equals(" ")){
					num2.delete(0, 1);
				}int index= 0, index2 = num2.indexOf(" ");
				if(index2<0){
					index2=num2.length();
				}stringDigits[f]= num2.substring(index, index2);	
				num2.delete(index, index2);
			}
			
			int intDigits[] = new int[counter]; 
			for(int f=0; f<counter; f++){
				intDigits[f]= Integer.parseInt(stringDigits[f]);
			}
			boolean arithmetic = false, geometric = false;
			double diff = 0, ratio = 0, firstDiff=0, firstRatio=0;
			if(counter > 2){
				//find differences
				for(int f=0; f<counter-1; f++){
					diff = (double)intDigits[f+1] - intDigits[f];
					if(f<1){
						firstDiff = diff;
					}if(firstDiff==diff){
						arithmetic = true;
					}else{
						arithmetic = false; break;
					}
				}for(int f=0; f<counter-1; f++){
					ratio = (double)intDigits[f+1] / intDigits[f];
					if(f<1){
						firstRatio = ratio; 
					}if(firstRatio==ratio){
						geometric = true;
					}else{
						geometric = false; break;
					}
				}
			}
			if(arithmetic ==true){
				nextNum = intDigits[counter-1] + (int)diff;
			}
			if(geometric==true){
				nextNum = (int)(intDigits[counter-1] * ratio);
			}
			System.out.println(nextNum);
			
			
			
			
			
		}
	}
}
