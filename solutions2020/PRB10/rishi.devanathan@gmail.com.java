import java.util.Scanner;

/**
* 
* @Rishikesh 
*
*/
public class PRB10 {
	
   public static void main(String[] args) {
   	// Take input
       Scanner in = new Scanner(System.in);
       String fraction = in.next();
       String[] parts = fraction.split("/");
       
       int a = Integer.parseInt(parts[0]);
       int b = Integer.parseInt(parts[1]);
       
       int GCD = GCD(a,b);
       String Output = (a / GCD) + "/" + (b / GCD);
    
    	
       System.out.print(Output);
       
   }

private static int GCD(int a, int b) {
	return b==0 ? a : GCD(b, a%b);
}
   
}

