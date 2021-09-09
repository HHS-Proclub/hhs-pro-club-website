import java.util.Scanner;

public class PRB5 {
	   public static void main (String[] args){
	    	 Scanner sc = new Scanner(System.in);
	    	 
	    	String line1 = sc.nextLine();
	    	String line2 = sc.nextLine();
	        
	    	String[] stringA = line1.split(" ");
	    	String[] stringB = line2.split(" ");
	    	int[] a = new int[stringA.length];
	    	int[] b = new int[stringB.length];
	        for(int i = 0; i < stringA.length; i++){
	        	a[i] = Integer.parseInt(stringA[i]);
	        }
	        for(int i = 0; i < stringB.length; i++){
	        	b[i] = Integer.parseInt(stringB[i]);
	        }
	        
	        System.out.println("" + (findMax(a)+findMax(b)));
	
	     }
	   public static int findMax(int[] array){
		   int greatest = 0;
		   for(int i = 0; i < array.length; i++){
			   int current = array[i];
			   if(current%10 == 0 && current > greatest){
				   greatest = current;
			   }
		   }
		   return greatest;
	   }
}
