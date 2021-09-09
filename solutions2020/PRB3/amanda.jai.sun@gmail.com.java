
import java.util.Scanner; 

public class PRB3 {
	public static void main (String[] args){   

		Scanner keyboard = new Scanner (System.in);

		int a = keyboard.nextInt();
		for(int j=1; j<=a; ++j){

			int x = keyboard.nextInt();
			for(int i=1; i<=x; ++i){
				if(x%i==0){
					System.out.println(i);

				}
			}
		}
	}

}
