import java.util.*;

public class PRA5{

	public static void main(String[] args){
		Scanner ech = new Scanner(System.in);
		int Nogang = ech.nextInt();
		int Actually = ech.nextInt();
		int BeeMovie = ech.nextInt();
		int CARS = BeeMovie * Nogang;
		int BILLIONDALLUHS = 0;
		while(CARS - BeeMovie >= BILLIONDALLUHS + Actually){
			CARS -= BeeMovie; 
			BILLIONDALLUHS += Actually;
		}
		if(CARS - BeeMovie >= BILLIONDALLUHS){
			CARS -= BeeMovie;
		}
		System.out.println(BILLIONDALLUHS);
	}
}