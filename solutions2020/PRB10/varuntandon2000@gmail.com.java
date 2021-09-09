import java.util.Arrays;
import java.util.Scanner;

public class PRB10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String frac = s.nextLine();
		String[] numanddenom = frac.split("/", 0);
		int num = Integer.parseInt(numanddenom[0]);
		int denom = Integer.parseInt(numanddenom[1]);
		int thing = Math.max(num, denom);
		for(int i = 1; i <= thing; i++){
			if(num%i == 0 && denom%i == 0){
				num /= i;
				denom /= i;
				i = 1;
			}
		}
		System.out.println(num + "/" + denom);
			
	}

}
