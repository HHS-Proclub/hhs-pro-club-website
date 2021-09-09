import java.util.*;

public class PRA1{
	public static void main(String[] args){
		Scanner crowbar = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			String ech = crowbar.nextLine();
			System.out.println(snapCrowbar(ech));
		}
	}
	public static boolean snapCrowbar(String heracles){
		int doggo = Integer.parseInt(heracles.substring(0,heracles.indexOf(" ")));
		int coconut = Integer.parseInt(heracles.substring(heracles.indexOf(" ")+1, heracles.lastIndexOf(" ")));
		int fiftysix = Integer.parseInt(heracles.substring(heracles.lastIndexOf(" ")+1));
		if(fiftysix / 5 <= coconut){
			if(fiftysix %5 <= doggo)
				return true;
			
		
		}
		return false;
	}
}