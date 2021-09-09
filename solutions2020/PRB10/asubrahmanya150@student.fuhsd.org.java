import java.util.Scanner;

public class PRB10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] fraction = (in.nextLine()).split("/");
		int num = Integer.parseInt(fraction[0]);
		int den = Integer.parseInt(fraction[1]);
		int mod = 1;
		for(int i = 1; i < num + den; i ++){
			if(num%i == 0 && den%i == 0){
				mod = i;
			}
			
		}
		System.out.println(num/mod + "/" + den/mod);
	}

}
