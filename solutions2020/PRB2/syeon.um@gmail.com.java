import java.io.*;

public class PRB2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int years = Integer.parseInt(a);
		for (int i = 0; i < years; i++) {
			String[] b = br.readLine().split(" ");
			int n = Integer.parseInt(b[0]);
			int d = Integer.parseInt(b[1]);
			int m = Integer.parseInt(br.readLine());
			for (int j = 0; j < m; j++) {
				String[] c = br.readLine().split(" ");
				int x = Integer.parseInt(c[0]);
				int y = Integer.parseInt(c[1]);
				if (y >= -x + d && y <= -x + (d + 2 * (n - d)) && y <= x + d && y >= x - d) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}

}
