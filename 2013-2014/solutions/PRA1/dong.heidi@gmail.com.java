import java.util.Scanner;


public class PRA1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int shift = input.nextInt();
		input.nextLine();
		String str = input.nextLine();
		int charCode;
		for(int i=0;i<=str.length()-1;i++){
			charCode = str.charAt(i);
			if (charCode<=122 && charCode>=97){
				charCode += shift;
				if (charCode>122) { charCode-=26; }
			}
			System.out.print((char)charCode);
		}
	}

}
