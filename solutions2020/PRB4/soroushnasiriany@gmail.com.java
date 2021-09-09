import java.util.Scanner;

public class PRB4 {
     public static void main (String[] args){
    	 Scanner sc = new Scanner(System.in);
    	 
    	int i = sc.nextInt();
    	int j = sc.nextInt();
        
        for(int y = 0; y < j; y++){
        	int addBy = (i*y);
            System.out.println(i+addBy);
        }
     }
}