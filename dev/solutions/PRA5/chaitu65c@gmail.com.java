import java.util.Scanner;
import java.math.*;
public class PRA5 {
  public static void main(String[] args){
	  Scanner kboard = new Scanner(System.in);
	  System.out.println();
	  int n = kboard.nextInt();
	   double result = Math.pow( 2 , n);
	   int y = (int)result;
	   y = y-1;
	  if( n > 0 && n< 30){
		  System.out.println(y);
	  }
	  
  }
  
}
