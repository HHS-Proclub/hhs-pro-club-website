import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int problems = Integer.parseInt(in.nextLine());
		while(problems>0) {
			problems--;
			String l = in.nextLine();
			String letters = in.nextLine();
			int zeros=0;
			for(int i=0;i<letters.length();i++) {
				if(letters.charAt(i)=='z')
					zeros++;
			}
			int ones = (letters.length()-4*zeros)/3;
			String solution="";
			while(ones>0) {
				if(ones==1&&zeros<1)
					solution+="1";
				else
					solution+="1 ";
				ones--;
			}
			while(zeros>0) {
				
				if(zeros==1)
					solution+="0";
				else
					solution+="0 ";
				zeros--;
			}
			System.out.println(solution);
		}
	}
}
