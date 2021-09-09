import java.util.Scanner;

public class PRA4 {

	public static void permutations(String original, String left){
		if(left.length()<3){
			System.out.println(original+left);
			System.out.println(original+left.charAt(1)+left.charAt(0));
		}else{
			permutations(original+left.charAt(0),left.substring(1));
			for(int i=1;i<left.length();i++){
				permutations(original+left.charAt(i),left.substring(0,i)+left.substring(i+1));
			}
		}
	}
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String letters="a";
		for(int i=1;i<num;i++){
			letters+=(char)(i+97);
		}
		permutations("",letters);
	}
}
