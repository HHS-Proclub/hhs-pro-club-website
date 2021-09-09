import java.util.*;

public class PRB3{
	public static void main(String[] args){
		Scanner crowbar = new Scanner(System.in);
		int coconut = crowbar.nextInt();
		for(int i = 0; i < coconut; i++){
			int swood = crowbar.nextInt();

			for(int j = 1; j<=swood; j++){
				if(swood % j == 0) System.out.println(j);
			}
		
	}
}
}