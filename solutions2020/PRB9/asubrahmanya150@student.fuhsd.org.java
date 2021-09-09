import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int reps = Integer.parseInt(in.nextLine());
		for(int i = 0; i < reps; i++){
			String input = in.nextLine();
			StringBuilder myName = new StringBuilder(input);
			boolean dela = false;
			boolean delb = false;
			if(myName.charAt(0)== 'a'){
				
			}
			else{
				dela = true;
			}
			if(myName.charAt(1) == 'b'){
				
			}
			else{
				delb = true;
			}
			if(delb == true){
				myName.delete(1, 2);
			}
			if(dela == true){
				myName.delete(0, 1);
			}
			
			System.out.println(myName);
		}

	}

}
