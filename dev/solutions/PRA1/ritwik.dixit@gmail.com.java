/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRA1{
	
		//submitted by Ritwik Dixit
	
	private char[] decimalHexes = {'A', 'B', 'C', 'D', 'E', 'F'};
	private String[] decimalConversions = {"10", "11", "12", "13", "14", "15"};
	
	private ArrayList<Integer> Swagger = new ArrayList<Integer>();
	private StringBuilder finalString = new StringBuilder("");
		
	
	public int convertToDecimal(String Hex) {
		
		//goes through string 
		int decimal = 0;
		
		for (int i = 0; i < Hex.length(); i++) {
			//j is so that it starts from the end right to left
			int j = Hex.length() - i - 1;
			try {
				decimal += Character.getNumericValue(Hex.charAt(i)) * Math.pow(16, j);

				
			} catch (Exception e) {			
				for (int b = 0; b < decimalHexes.length; b++) {
					if (Hex.charAt(i) == decimalHexes[b]) {
						decimal += Integer.valueOf(decimalConversions[b]) * Math.pow(16, j);
					} else System.out.println("ERROR");
				}
			}
	
			
		}
		
		return decimal;
		
	}

	public int decimalToHex(int digit, int number) {
		
		if (number == 0 && digit <= 0) {		
			return 1;
		} 
		
		int firstNumTo = 0;

	
		for (int i = 15; i >= 0; i--) {
			
			if (Math.pow(16, digit)*i <= number){
				
				//first digit term to be under the number
				Swagger.add(i);
				firstNumTo = i;
				break;
			}
		}
	
		decimalToHex(digit - 1, (int)(number - (Math.pow(16, digit)*firstNumTo)));

	
	
			return 2;
	}
	
	public String formatFinal() {
		
		for (int i : Swagger){
			int j = 0;

			if (i <= 9) {
				finalString.append(i);
			} else {
				j = i - 10;
				finalString.append(decimalHexes[j]);
			}
			
		}
		
		String gsus = finalString.toString();
				
		if (convertToDecimal(gsus) % 16 == 0) {
			finalString.append("0");			
			gsus = finalString.toString();
		}    
		
		return gsus;
			
	}

	public int factorTwo(int numOne, int numTwo) {
		
		int greatestCommonFactor = 0;
		int biggernum = 0;
		
		if (numOne > numTwo) {
			biggernum = numOne;
		} else if (numTwo > numOne) {
			biggernum = numTwo;
		} else return numOne;
		
		for (int i = 1; i <= biggernum; i++) {
			if (numOne % i == 0 && numTwo % i ==0)
				greatestCommonFactor = i;
		}
		
		
		return greatestCommonFactor;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
				PRA1 obj = new PRA1();
		
	BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));

		int useOne;
		int useTwo;
		
		String inOne = inputs.readLine();
		
		String inTwo = inputs.readLine();
		
		useOne = obj.convertToDecimal(inOne);
		useTwo = obj.convertToDecimal(inTwo);
		
		int gcf = obj.factorTwo(useOne, useTwo);
		
		obj.decimalToHex(3, gcf);	
		String gcfHex = obj.formatFinal();
		if (gcfHex.equals("001")) gcfHex = "0010";
		
		System.out.println(gcf);
		System.out.println(gcfHex);
	}
}