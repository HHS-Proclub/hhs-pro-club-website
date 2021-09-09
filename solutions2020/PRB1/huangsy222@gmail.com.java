import java.io.*;
import java.util.*;

public class PRB1
{
	static BufferedReader reader;
	static PrintWriter writer;
	static StringTokenizer st;
	static int T;
	static long m, n;
	public static void main(String[] argv) throws IOException
	{
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		T = Integer.parseInt(reader.readLine());

		for(int t = 0;t < T;++t)
		{
			st = new StringTokenizer(reader.readLine());
			m = Long.parseLong(st.nextToken());
			n = Long.parseLong(st.nextToken());
			writer.printf("%d\n", m*n);
		}

		reader.close();
		writer.close();
	}
}
