import java.util.Arrays;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int nPhones = in.nextInt(), charge = in.nextInt();
			// each subarray is in following format: charge use, and initial charge
			int[] phonePowerUse = new int[nPhones];
			double[] phoneBattery = new double[nPhones];
			
			for (int j = 0; j < nPhones; j++) {
				phonePowerUse[j] = in.nextInt();
				phoneBattery[j]= in.nextInt();
			}
			
			Arrays.sort(phonePowerUse);
			Arrays.sort(phoneBattery);
			phoneBattery[0] += charge;
			Arrays.sort(phoneBattery);
			System.out.println(phoneBattery[0]/phonePowerUse[0]);
		}
		
		in.close();
	}

}
