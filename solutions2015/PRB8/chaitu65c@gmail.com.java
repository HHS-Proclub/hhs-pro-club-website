import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class PRB8 {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		String num = a.nextLine();
		int n1 = Integer.parseInt(num.substring(0, num.indexOf(" ")));
		int n2 = Integer.parseInt(num.substring(num.indexOf(" ") + 1));
		for(int i = 1; i < Integer.MAX_VALUE; i++){
			if((i % n1 == 0) && (i % n2 == 0)){
				System.out.println(i);
				break;
			}
		}
		
	}
}
