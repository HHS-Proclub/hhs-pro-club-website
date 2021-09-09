import java.io.*;

public class PRB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try {
			String a = br.readLine();
			int x = Integer.parseInt(a);
			for (int i = 0; i < x; i ++) {
				String [] b = br.readLine().split(" ");
				System.out.println(Integer.parseInt(b [0]) + Integer.parseInt(b [1]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
