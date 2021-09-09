import java.util.Scanner;


public class PRA4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binaryN = input.nextLine();
		int toAdd=1;
		int total = binaryN.charAt(binaryN.length()-1)=='0' ? 0 : 1;
		for(int i=binaryN.length()-2;i>=0;i--) {
			toAdd *= 2;
			if(binaryN.charAt(i)=='1') {
				total+=toAdd;
			}
		}
		double newTotal = total*17;
		String output = "";
		while(newTotal>0) {
			if (newTotal % 2 == 0) {
				output+="0";
				newTotal /= 2;
			}
			else {
				output+="1";
				newTotal = (newTotal-1)/2;
			}
		}
		for (int i=output.length()-1;i>=0;i--) {
			System.out.print(output.charAt(i));
		}
	}

}
