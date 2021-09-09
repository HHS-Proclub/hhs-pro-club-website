/*  Linear Equation Solver
 *  Ritwik Dixit 2014
 *  Homestead Programming Club 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	
	//holds all elements
	private ArrayList<String> terms = new ArrayList<String>(); 
	private ArrayList<String> signs = new ArrayList<String>(); 

	public void splitS(String s) {
		
		//this will be used for the equals sign, flipping everything
		boolean equalsYet = false;
		//flag determines where the current sequence started
		int flag = 0;
		
		for (int i = 0; i < s.length(); i++) {		
			
			String charc = s.substring(i, i+1);		
			//below adds everything to the lists
			
			if (charc.equals("+") || charc.equals("-")) {
				
				terms.add(s.substring(flag, i));
				flag = i + 1;
				
			} else if (charc.equals("=")) {
				terms.add(s.substring(flag, i));
				flag = i + 1;
				equalsYet = true;
			}
			
		}
		
		terms.add(s.substring(flag, s.length()));
		terms.removeAll(Arrays.asList(null,""));	
		splitSigns(s);
			
	}

	public void splitSigns(String s) {
		
		/*account for two cases, when the first char
		 * or char after the equals is not + or -
		 */
		boolean pastEquals = false;

		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (c == '=') {
				pastEquals = true;
				if (s.charAt(i+1) != '-')
					signs.add("-");
			}
			
			if (!pastEquals) {
				
				if (i == 0 && c != '-')
					signs.add("+");
				if (c == '+' || c == '-')
					signs.add(c+"");

			} else {
				
				if (c == '+')
					signs.add("-");
				if (c == '-')
					signs.add("+");
				
			}
				
		} //end of iterations
	}

	public double letsRecount() {
		
		double vars = 0;
		double constants = 0;
		int signCount = 0;
		
		for (String s : terms) {	
			
			String current = s.replaceAll("\\s","");	
			
			if (isNumeric(signs.get(signCount) + current)) {
				//means it is a constant because the full thing properly parsed
				constants += Double.parseDouble(signs.get(signCount) + current);  
			} else {
				//cut off last 2 (*var) and add to vars
				try {
					vars += Double.parseDouble(signs.get(signCount)+current.substring(0, current.length()-2));
				} catch (Exception e) {
					//this means that it is an expression such as 4 * 8 or a single variable
					if (current.length() == 1)
						vars += Double.parseDouble(signs.get(signCount)+ "1");
					else 
						constants += Double.parseDouble(signs.get(signCount)+evalMult(current));
				}
			}
			signCount++;
		}
		return -constants/vars;
	}
	
	public double evalMult(String s) {
		
		s = s.replaceAll("\\s","");	
		//backwards recursion for left to right 
		for (int i = s.length() - 1; i >= 0; i--) {
			
			if (s.charAt(i) == '*') {
				return evalMult(s.substring(0, i)) * Double.parseDouble(s.substring(i+1));
			} else if (s.charAt(i) == '/') {
				return evalMult(s.substring(0, i)) / Double.parseDouble(s.substring(i+1));
			} /*else if (s.charAt(i) == '%') {
				return evalMult(s.substring(0,i)) % Double.parseDouble(s.substring(i+1));
			}*/
		}
		
		return Double.parseDouble(s);
	}
	
	public static boolean isNumeric(String str) {  
	  try {  
	    double d = Double.parseDouble(str);  
	  } catch(NumberFormatException e) {  
	    return false;  
	  } 
	  return true;  
	}
	
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		String s = inp.nextLine();		
		PRA4 test = new PRA4();
		
		test.splitS(s.replaceAll(" ", ""));
		
		double realResult = test.letsRecount();
		int result;
		if (realResult < 0)
			result = (int)(realResult-0.5);
		else 
			result = (int)(realResult+0.5);
	
		System.out.println(result);
	}

}
