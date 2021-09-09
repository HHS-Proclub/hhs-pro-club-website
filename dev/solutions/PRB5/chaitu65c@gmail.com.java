import java.util.Scanner;
public class PRB5 {
	public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
		System.out.println("");
		String y;
        String x = kboard.nextLine();
        if(x.indexOf(" not ") < 15){
        	do{
            	y = x.replaceAll(" not ", " ");
                x = y.replaceAll("  ", " ");
            }while(x.indexOf(" not ") > 0);
           System.out.println(y);	
        }
        else{
        	System.out.print("");
        	x = kboard.nextLine();
        }
        
	}
}
