import java.util.Scanner;


public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: two hexadecimal numbers
		//output:decimal GCD and hexadecimal GCD
		Scanner kboard = new Scanner(System.in);
		String input1 = kboard.nextLine();
		String input2 = kboard.nextLine();
//		String input1 = "047B";
//		String input2 = "0965";
		int hex1 = hexToDec(input1);
		int hex2 = hexToDec(input2);
		int gcf0 = gcf(hex1,hex2);
		System.out.println(""+gcf0);
		System.out.println(""+decToHex(gcf0));
		
	}
	
	public static int gcf(int a, int b){
		int gcf = 0;
		if (a==0)gcf=b;
		while(b!=0){
			if(a>b)a-=b;
			else b-=a;
		}
		if(a!=0)gcf=a;
		return gcf;
	}

	public static int hexToDec(String hex){
		int total = 0;
		for(int i = 0; i<hex.length();i++){
			char digit = hex.charAt(hex.length()-i-1);
			int digitNumber;
			if (Character.isAlphabetic(digit)){
				char digitLower = Character.toLowerCase(digit);
				digitLower-=49;
				digitNumber = Integer.parseInt(digitLower+"") + 10;
			}
			else{
				digitNumber=Integer.parseInt(digit+"");
			}
			total+=Math.pow(16,i)*digitNumber;
		}
		return total;
	}
	
	public static String decToHex(int decimal){
		String total="";
		int max = (decimal+"").length(); //2
		//37. -16, -16, 5.
		char[] digits = new char[max];
		int[] digitsI = new int[max];
		int previous=0;
		for(int i=0; i<max; i++){
			digitsI[i] = decimal%(int)Math.pow(16,i+1)-previous; //37%16=5;
			digitsI[i]/=Math.pow(16, i);
			previous=digitsI[i];
			if(digitsI[i]>9){ //retyping is a worthy substitute for ASCII
				if(digitsI[i]==10)digits[i]='A';
				if(digitsI[i]==11)digits[i]='B';
				if(digitsI[i]==12)digits[i]='C';
				if(digitsI[i]==13)digits[i]='D';
				if(digitsI[i]==14)digits[i]='E';
				if(digitsI[i]==15)digits[i]='F';
			}
			else{
				digits[i]=(char)digitsI[i];	
			}
			total=(""+digitsI[i]+total);
		}
		while(total.length()<4)total='0'+total;
		return total;
	}
}