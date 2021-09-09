import java.util.*;

public class PRB5 {
	
	private static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[]Args){
		Scanner inputReader = new Scanner(System.in);
		int c = inputReader.nextInt();

		System.out.println(returnGreatestInt(c, inputReader));
	}
	public static int returnGreatestInt(int c, Scanner inputReader){
		for(int i = 0; i < c; i++){
			array.add(inputReader.nextInt());
		}

		Collections.sort(array);
		return array.get(c-1);
	}
}
