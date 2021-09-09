import java.util.Scanner;

public class PRA2 {
	static Scanner k = new Scanner(System.in);

	public static void main (String[] args){
		 String s1 = k.next();
		 String s2 = k.next();
		 sift(s1,s2);
		  }
		

	public static void sift(String a, String b){
		StringBuffer new1 =new StringBuffer(a);
		StringBuffer new2 =new StringBuffer(b);
		String commonChars = b.replaceAll("[^"+a+"]","");
		for (int i=0;i<commonChars.length();i++){
			if ((new1+"").contains(commonChars.charAt(i)+"")){
				new1.deleteCharAt((new1+"").indexOf(commonChars.charAt(i)));
			}
		}
		for (int i=0;i<commonChars.length();i++){
			if ((new2+"").contains(commonChars.charAt(i)+"")){
				new2.deleteCharAt((new2+"").indexOf(commonChars.charAt(i)));
			}
		}
		int var1 = Math.abs(new1.length()-new2.length());
		if (new2.length()<new1.length())
			System.out.println(Math.abs(new2.length()+var1)+1);
		else
			System.out.println(Math.abs(new1.length()+var1)+1);
	}
}
