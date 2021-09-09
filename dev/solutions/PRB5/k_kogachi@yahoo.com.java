import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Kazu Kogachi
 * Jan 10, 2015
 */
public class PRB5 {

	public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
			input = in.readLine();
		} catch (IOException e) {
			input = "Error Occured";
			e.printStackTrace();
		}
        
       input = input.replaceAll("not not ", "");
       System.out.println(input);
	}

}
