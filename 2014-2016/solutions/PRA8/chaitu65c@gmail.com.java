import java.util.Scanner;
public class PRA8 {
	public static void main(String[] args){
		Scanner h= new Scanner(System.in);
		int base = h.nextInt();
		 for(int i = 1; i <= 300; i++) {
		      int sqr = i * i;  
		 
		      String represent = Integer.toString(sqr, base).toUpperCase(); 
		 
		      boolean pal = true;
		      for(int j = 0; j < represent.length() / 2; j++) {
		        if(represent.charAt(j) != represent.charAt(represent.length() - j - 1)) {
		          pal = false;
		        }
		      }
		 
		      if(pal) {
		        System.out.println(Integer.toString(i, base).toUpperCase() + " " + represent);
		      }
		    }
		 
		
	}
}
