import java.io.*;

public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String a = br.readLine();
			int x = Integer.parseInt(a);
			for (int i = 0; i < x; i++) {
				String b = br.readLine();
				int y = Integer.parseInt(b);
				while (true) {
					y++;
					String c = y + "";
					if (c.charAt(0) != c.charAt(1)) {
						if (c.charAt(0) != c.charAt(2)) {
							if (c.charAt(0) != c.charAt(3)) {
								if (c.charAt(1) != c.charAt(2)) {
									if (c.charAt(1) != c.charAt(3)) {
										if (c.charAt(2) != c.charAt(3)) {
											break;
										}
									}
								}
							}
						}
					}
				}
				System.out.println(y);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}