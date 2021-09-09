import java.util.Scanner;
public class PRB1 {
     public static void main (String[] args){
    	 Scanner sc = new Scanner(System.in);
    	 int count = sc.nextInt();
    	 //System.out.println(count);
    	 for (int i = 0; i < count; i++) {
    		 System.out.println("" + (sc.nextInt() + sc.nextInt()));
    	 }
    	 sc.close();
     }
}
