import java.util.ArrayList;
import java.util.Scanner;

public class PRB7 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		String input = scanner.nextLine();
		String [] inputs = input.split(", ");
//		for(String x : inputs)
//			System.out.println(x);
		int[] fish = new int[inputs.length];
		for(int i = 0; i < fish.length; i++)
			fish[i] = Integer.parseInt(inputs[i]);
		for(int i = 0; i < fish.length - 1; i++){
			if(fish[i] == fish[i+1]){
				total++;
				while(fish [i] == fish[i+1] && i < fish.length - 2)
					i++;
			}
			
		}
			System.out.println(total);
	}
}
