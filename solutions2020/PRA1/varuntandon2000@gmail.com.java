import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA1 {
	  public static void main (String [] args) throws IOException {
		  	Scanner s = new Scanner(System.in);
		  	for(int i = 0; i < 5; i++){
		  		StringTokenizer tokens = new StringTokenizer(s.nextLine());
		  		int numOne = Integer.parseInt(tokens.nextToken());
		  		int numFive = Integer.parseInt(tokens.nextToken());
		  		int wallSize = Integer.parseInt(tokens.nextToken());
		  		
		  		int numDecrements = 0;
		  		while(wallSize%5 != 0 && numOne > numDecrements){
		  			wallSize--;
		  			numDecrements++;
		  		}
		  		System.out.println(wallSize%5 == 0 && wallSize/5 <= numFive);
		  			
		  		
		  	}
		    
}
}
