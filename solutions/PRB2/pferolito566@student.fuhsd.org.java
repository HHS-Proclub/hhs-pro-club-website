import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner kboard=new Scanner(System.in);
		int num;
		num=kboard.nextInt();
		kboard.nextLine();
		for(int a=0;a<num;a++) {
			boolean bad=false;
			for(int i=0;i<3;i++) {
				String temp;
				temp=kboard.nextLine();
				int count=0;
				for(int j=0;j<temp.length();j++) {
					if(in(temp.charAt(j))) {
						count++;
					}
				}
				if(i==0 && count!=5) {
					bad=true;
				}else if(i==1 && count!=7) {
					bad=true;
				}else if(i==2 && count!=5) {
					bad=true;
				}
			}
			if(!bad) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean in(char character) {
		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u') {
			return true;
		}
		if(character=='A' || character=='E' || character=='I' || character=='O' || character=='U') {
			return true;
		}
		return false;
	
	}
}
