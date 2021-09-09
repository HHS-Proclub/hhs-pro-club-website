import java.util.Scanner;

public class PRA16 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		String garb = kboard.nextLine();
		for(int i = 0; i < num; i++) {
			String sample = kboard.nextLine();
			char[] suits = new char[sample.length()/2];
			char[] values = new char[sample.length()/2];
			int[] intArray = new int[sample.length()/2];
			for(int j = 0; j < sample.length()/2; j++) {
				suits[j] = sample.charAt(2*j);
				//System.out.println(suits[j]);
			}
			for(int j = 0; j < sample.length()/2; j++) {
				values[j] = sample.charAt(2*j+1);
				if(values[j] == 'A') {
					intArray[j] = 1;
				} else if (values[j] == 'T') {
					intArray[j] = 10;
				} else if (values[j] == 'J') {
					intArray[j] = 10;
				} else if (values[j] == 'Q') {
					intArray[j] = 10;
				} else if (values[j] == 'K') {
					intArray[j] = 10;
				} else {
					intArray[j] = values[j]-48;
				}
				//System.out.println(values[j] + " "+(2*j+1));
			}
		        
			int n = suits.length;  
	        char temp = 0;  
	        //int temp2 = 1;
	         for(int k=0; k < n; k++){  
	                 for(int j=1; j < (n-k); j++){  
	                          if(suits[j-1] > suits[j]){  
	                                 //swap elements  
	                                 temp = suits[j-1];  
	                                 suits[j-1] = suits[j];  
	                                 suits[j] = temp;  
	                                 temp = values[j-1];  
	                                 values[j-1] = values[j];  
	                                 values[j] = temp;  
	                         }  
	                          
	                 }  
	         }  

	         String theFinal = "";
	         
		     for (int k = 0; k < suits.length; k++) {
		    	 theFinal = theFinal+suits[k]+values[k];
		     }
		     
		     System.out.println(theFinal);
			
		}
	}
}
