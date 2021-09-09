import java.util.Scanner;

public class PRA10 {
	public static boolean checkPall(int number){
		boolean result = true;
		String temp = Integer.toString(number);
		String[] cache = temp.split("(?!^)");
		for(int i = 0; i < cache.length; i++){
			if(cache[i].equals(cache[cache.length-(i+1)])){
				
			}
			else{
				result = false;
			}
		}
		return result;
	}
	public static boolean checkPrime(int number){
		boolean result = true;
		for(int i = 2; i < number; i++){
			if(number%i == 0){
				result = false;
			}
			else{
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int reps = Integer.parseInt(in.nextLine());
		for(int i = 0; i < reps; i++){
			String[] unparsed = (in.nextLine()).split(" ");
			int[] data = new int[2];
			data[0] = Integer.parseInt(unparsed[0]);
			data[1] = Integer.parseInt(unparsed[1]);
			int counter = 0;
			if(data[0] == 1){
				data[0]++;
			}
			for(int start = data[0]; start < data[1] + 1; start++){
				if(checkPrime(start) == true && checkPall(start) == true){
					counter++;
				}
			}
		System.out.println(counter);
		}
	}

}
