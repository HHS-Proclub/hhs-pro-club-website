import java.util.Scanner;


public class PRB5 {
	private static int counter =0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sen = new StringBuffer(in.nextLine());
		int x = sen.indexOf("not");
		while(sen.indexOf("not")>=0){
			counter++;
			sen.delete(sen.indexOf("not"), sen.indexOf("not")+4);
		}
		if(counter%2==0){
			System.out.println(sen);
		}else{
			System.out.println(sen.insert(x, "not "));
		}
	}

}
