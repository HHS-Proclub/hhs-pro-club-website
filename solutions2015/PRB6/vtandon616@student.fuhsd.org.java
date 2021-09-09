import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String line = "";
		ArrayList<Integer> fish = new ArrayList<Integer>();
		
		int num = scanner.nextInt();
		for(int i = 0; i < num; i++)
			fish.add(scanner.nextInt());
		int count = 0;
		int max = 0;
		for(int i = 0; i < fish.size(); i++){
			
			if(!(fish.subList(i, fish.size() - 1).contains(fish.get(i)))){
					fish.remove(i);
					max = count;
					count = 0;
			}else{
				count++;
			}
		}
		System.out.println(max/2);
	}
}
