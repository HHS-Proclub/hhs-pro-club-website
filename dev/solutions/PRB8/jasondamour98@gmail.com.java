import java.util.Scanner;


public class PRB8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String startingSet = input.nextLine(), endingSet = input.nextLine();
		
		if(startingSet.isEmpty() || endingSet.isEmpty()){
			System.out.println("NONE");
		}else{
			for(int i = 0; i<startingSet.length(); i++){
				char test = startingSet.charAt(i);
				if(!endingSet.contains(""+test)){
					System.out.print(test);
				}
			}			
			System.out.println();

			for(int i = 0; i<endingSet.length(); i++){
				char test = endingSet.charAt(i);
				if(!startingSet.contains(""+test)){
					System.out.print(test);
				}
			}
			
		}
	}
}
