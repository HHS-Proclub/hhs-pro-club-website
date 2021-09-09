import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Kazu Kogachi
 * Mar 17, 2015
 */
import java.io.PrintWriter;

public class PRB13 {

	public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String input;
        try {
			input = in.readLine();
		} catch (IOException e) {
			input = "Error Occured";
			e.printStackTrace();
		}
       
        boolean isPali = true;
        for(int i = 0; i < input.length()/2; i++){
        	if (input.charAt(i) != input.charAt(input.length()-(i+1))) {
    		   isPali = false;
    		   break;
    	   }
       }
       System.out.println(isPali);
	}
	
}
