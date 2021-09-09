import java.util.Scanner;

public class PRA6 {

	public static void main(String[] args) {
		final String PI = "pi", KA = "ka", CHU = "chu";
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		StringBuffer[] pikabuffers = new StringBuffer[num];
		
		for (int i = 0; i < pikabuffers.length; i++) {
			String pikaspeak = in.next();
			pikabuffers[i] = new StringBuffer(pikaspeak);
		}
		
		for (StringBuffer pikabuffer : pikabuffers) {
			while (pikabuffer.indexOf(PI) > -1) {
				int i = pikabuffer.indexOf(PI);
				pikabuffer.delete(i, i+2);
			}
			
			while (pikabuffer.indexOf(KA) > -1) {
				int i = pikabuffer.indexOf(KA);
				pikabuffer.delete(i, i+2);
			}
			
			while (pikabuffer.indexOf(CHU) > -1) {
				int i = pikabuffer.indexOf(CHU);
				pikabuffer.delete(i, i+3);
			}
			
			if (pikabuffer.length() > 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}
