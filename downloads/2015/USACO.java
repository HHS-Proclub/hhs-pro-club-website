import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class USACO {

	public static void main(String[] args) throws IOException {
		// Read from input file
		BufferedReader in = null;
		in = new BufferedReader(new FileReader("inputfile.in"));

		// Example of parsing input
		String line1 = in.readLine();
		int n = Integer.parseInt(line1.split(" ")[0]);
		int k = Integer.parseInt(line1.split(" ")[1]);
		
		// Write to output file
		BufferedWriter out = null;
		out = new BufferedWriter (new FileWriter("outputfile.out",true));
		out.write("output");
		out.close();
	}
	
}
