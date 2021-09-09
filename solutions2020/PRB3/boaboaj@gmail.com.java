import java.util.Arrays;
import java.util.Scanner;

public class PRB2 {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int count = 0; count < cases; count++)
		{
			int number = sc.nextInt();
			String num = String.valueOf(number);        
		    int stop = 0;
		    char [] chars = null;
		    loopthing:
		        for(int i = num.length() - 1; i > 0; i--){          
		            chars = num.toCharArray();
		            for(int j = i; j > 0; j--){
		                char temp = chars[j];
		                chars[j] = chars[j - 1];
		                chars[j - 1] = temp;
		                if(Integer.valueOf(new String(chars)) > number){
		                    stop = j;                   
		                    break loopthing;                                
		                }               
		            }               
		        }
	
		    Arrays.sort(chars, stop, chars.length); 
		    System.out.println(Integer.valueOf(new String(chars)));
		}
		
	}
}