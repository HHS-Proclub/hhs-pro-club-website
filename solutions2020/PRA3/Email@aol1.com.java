import java.util.*;
public class PRA3 {
	public static void main(String[] args){
		Scanner jon = new Scanner(System.in);
		int abominations = jon.nextInt();
		jon.nextLine();
		for(int i = 0; i < abominations; i++){
			String echs = jon.nextLine();
			int bubsy = Integer.parseInt(echs.substring(0, echs.indexOf(" ")));
			int bubsy2 = Integer.parseInt(echs.substring(echs.indexOf(" ")+1, echs.lastIndexOf(" ")));
			int bubsy3d = Integer.parseInt(echs.substring(echs.lastIndexOf(" ")+1));
			ArrayList<Jacques> rockingtons = new ArrayList<Jacques>(bubsy2);
			for(int j = 0; j < bubsy2; j++){
				String bird = jon.nextLine();
				rockingtons.add(new Jacques(Integer.parseInt(bird.substring(0, bird.indexOf(" "))),Integer.parseInt(bird.substring(bird.indexOf(" ")+1))));
			}
			Collections.sort(rockingtons, Collections.reverseOrder()); //Most swoodness lost
			for(int j = 0; j < bubsy2; j++){
				if(rockingtons.get(j).grantzisnazi > bubsy){ 
					rockingtons.remove(rockingtons.get(j));
					j--;
					bubsy2 --;
				}
			}
			for(Jacques a:rockingtons){
				System.out.println(a.bootleg);
			}
			for(int j = 0; j < bubsy2; j++){
				boolean gud = false;
				if(bubsy3d > 0) bubsy3d -= rockingtons.get(j).grommets;
				if(bubsy3d <= 0){
					gud = true;
				}
				if(bubsy > 0) bubsy -= rockingtons.get(j).grantzisnazi;
				if(bubsy < 0){
					System.out.println(-1);
					break;
				}
				if(gud){
					System.out.println(bubsy);
					break;
				}
			}
			if(bubsy3d > 0) System.out.println(-1);
		}
	}
}
class Jacques implements Comparable<Jacques>{
	int grommets, grantzisnazi, bootleg, grilled;
	public Jacques(int warnzzz, int goldflair){
		grommets = warnzzz;
		grantzisnazi = goldflair;
		bootleg = grommets/grantzisnazi;
		grilled = 0;
	}
	public int compareTo(Jacques b) {
		if(bootleg > b.bootleg) return 1;
		if(bootleg == b.bootleg) return 0;
		if(bootleg < b.bootleg) return -1;
		return 56;
	}
	
}
