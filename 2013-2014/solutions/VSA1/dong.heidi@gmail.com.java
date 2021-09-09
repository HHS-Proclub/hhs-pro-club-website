import java.util.Scanner;


public class VSA1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		int r = Integer.parseInt(in.split(" ")[0]); //rows
		int c = Integer.parseInt(in.split(" ")[1]); //columns
		int k = Integer.parseInt(in.split(" ")[2]); //magnification factor
		String[] text = new String[r];
		
		String row = null;
		for(int i=0;i<r;i++) {
			text[i] = input.nextLine();
			}

		for(int i=0;i<r;i++) {
				for(int h=0;h<k;h++) {
				for(int ch=0;ch<text[i].length();ch++) {
					for(int j=0;j<k;j++) {
						System.out.print(text[i].charAt(ch));
					}
				}
				System.out.println();
			}
		}
		
		
	}

}
