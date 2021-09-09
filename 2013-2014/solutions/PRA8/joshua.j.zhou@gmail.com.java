/**
 * Joshua Zhou
 * HHS Programming
 * Advanced Challenge 8
 *
 * (Identical to palsquare on USACO training)
 */

import java.util.*;

public class PRA8 {

    private Hashtable<Integer, Character> digitToSymbol =
            new Hashtable<Integer, Character>();
            
    private Hashtable<Character, Integer> symbolToDigit =
            new Hashtable<Character, Integer>();
            
    public PRA8() {
        for (int i = 0; i < 10; i++) {
            digitToSymbol.put(i, ("" + i).charAt(0));
        }
        
        for (int i = 10; i <= 20; i++) {
            digitToSymbol.put(i, (char)(i + 55));
        }
        
        for (int i = 0; i <= 20; i++) {
            symbolToDigit.put(digitToSymbol.get(i), i);
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        PRA8 converter = new PRA8();
        int base = keyboard.nextInt();
        
        for (int i = 1; i <= 300; i++) {
            int sq = i * i;
            String n = converter.fromBaseTen(sq, base);
            if (isPalindrome(n))
                System.out.println(converter.fromBaseTen(i, base) + " " + n);
        }
        
        keyboard.close();
    }
    
    private static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }
    
    private static String reverse(String s) {
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            c += s.charAt(s.length() - i - 1);
        }
        return c;
    }
    
    private String fromBaseTen(int x, int base) {
        return Integer.toString(x, base).toUpperCase();
    }
	
	private int toBaseTen(String x, int base) {
        int sum = 0;
	    for (int i = 0; i < x.length(); i++) {
	        char digit = x.charAt(x.length() - i - 1);
	        int digitValue = symbolToDigit.get(digit);
	        int placeValue = (int)Math.pow(base, i);
	        sum += digitValue * placeValue;
	    }
	    return sum;
	}

}
