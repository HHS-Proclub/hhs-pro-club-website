import java.util.Scanner;

public class PRA6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		in.nextLine();
		for (int i = 0; i < times; i++) {
			String[] line = in.nextLine().split(" ");
			int width = Integer.parseInt(line[0]);
			int L = Integer.parseInt(line[1]);
			line = (in.nextLine()).split("\\s+");
			int[] river = new int[line.length];
			for (int j = 0; j < river.length; j++) {
				river[j] = Integer.parseInt(line[j]);
			}
			// Solution starts here
			int sum = 0;
			for (int j = 0; j < L; j++) {
				sum += river[j];
			}
			int minValue = sum;
			for (int j = L; j < width - 1; j++) {
				sum = sum - river[j - L] + river[j];
				minValue = Math.min(minValue, sum);
			}
			System.out.println(minValue);
		}
		in.close();
	}
}