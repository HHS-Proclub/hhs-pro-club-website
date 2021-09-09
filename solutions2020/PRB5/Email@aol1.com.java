import java.util.*;

public class PRB5{

	public static void main(String[] args){
		Scanner jon = new Scanner(System.in);
		String[] rockingtons = jon.nextLine().split(" ");
		int[] aych = new int[rockingtons.length];
		int topH = 0;
		for(int H = 0; H < rockingtons.length; H++){
			aych[H] = Integer.parseInt(rockingtons[H]);
			if(aych[H] > topH) topH = aych[H];
		}

		String[] malkoviches = jon.nextLine().split(" ");
		int[] eych = new int[malkoviches.length];
		int OOOOH = 0;
		for(int H = 0; H < malkoviches.length; H++){
			eych[H] = Integer.parseInt(malkoviches[H]);
			if(eych[H] > OOOOH) OOOOH = eych[H];
		}
		System.out.println(topH + OOOOH);

	}
}