import java.util.Scanner;
public class PRB9 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		int size=kboard.nextInt();
        String [] numberarray = new String[size];
        for(int i = 0; i < numberarray.length; i++) {
  numberarray[i] = kboard.next();
  
        }
  for(int x = 0; x < numberarray.length; x++){
      
      if( numberarray[x].substring(0,1).equals("a")){
    	  if(numberarray[x].substring(1,2).equals("b")){
    		  System.out.println(numberarray[x]);}
    	  else
    		  System.out.println(numberarray[x].substring(0,1)+numberarray[x].substring(2,numberarray[x].length()));
    		   }
      
      else
    	  if(numberarray[x].substring(1,2).equals("b")){
    		  
    		  
    		  System.out.println(numberarray[x].substring(1,numberarray[x].length()));
    		  
    	  }
    	  else
    		  System.out.println(numberarray[x].substring(2,numberarray[x].length()));
 }
  
  
  
  
  
  
  
    }
}
